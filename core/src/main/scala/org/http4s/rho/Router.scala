package org.http4s
package rho

import bits.PathAST._
import cats.Functor
import org.http4s.rho.bits.{HeaderAppendable, TypedHeader}
import org.http4s.rho.bits.RequestAST.{AndRule, RequestRule}

import shapeless.{::, HList, HNil}
import shapeless.ops.hlist.Prepend

sealed trait RoutingEntity[F[_], M[_], T <: HList] {
  type Self <: RoutingEntity[F, M, T]

  def method: Method
  def path: PathRule
  def rules: RequestRule[F]

  def /:(path: TypedPath[F, M, HNil]): Self
  def withMethod(method: Method): Self
}

/** Provides the operations for generating a router
  *
  * @param method request methods to match
  * @param path path matching stack
  * @param rules header validation stack
  * @tparam T cumulative type of the required method for executing the router
  */
case class Router[F[_], M[_], T <: HList](method: Method, path: PathRule, rules: RequestRule[F])
    extends RouteExecutable[F, M, T]
    with HeaderAppendable[F, T]
    with RoutingEntity[F, M, T]
    with Decodable[F, M, T, Nothing]
    with RoutePrependable[F, M, Router[F, M, T]] {
  type Self = Router[F, M, T]

  override type HeaderAppendResult[T <: HList] = Router[F, M, T]

  override def /:(prefix: TypedPath[F, M, HNil]): Self =
    copy(path = PathAnd(prefix.rule, path))

  override def >>>[T1 <: HList](v: TypedHeader[F, T1])(implicit
      prep1: Prepend[T1, T]): Router[F, M, prep1.Out] =
    Router(method, path, AndRule(rules, v.rule))

  override def makeRoute(action: Action[F, T]): RhoRoute[F, M, T] = RhoRoute(this, action)

  override def decoding[R](
      decoder: EntityDecoder[F, R])(implicit F: Functor[F], m: M[R]): CodecRouter[F, M, T, R] =
    CodecRouter(this, decoder)

  def withMethod(other: Method): Self =
    copy(method = other)
}

case class CodecRouter[F[_], M[_], T <: HList, R](router: Router[F, M, T], decoder: EntityDecoder[F, R])(
    implicit model: M[R])
    extends HeaderAppendable[F, T]
    with RouteExecutable[F, M, R :: T]
    with RoutingEntity[F, M, R :: T]
    with Decodable[F, M, T, R] {
  type Self = CodecRouter[F, M, T, R]

  override type HeaderAppendResult[TU <: HList] = CodecRouter[F, M, TU, R]

  override def >>>[T1 <: HList](v: TypedHeader[F, T1])(implicit
      prep1: Prepend[T1, T]): CodecRouter[F, M, prep1.Out, R] =
    CodecRouter(router >>> v, decoder)

  override def /:(prefix: TypedPath[F, M, HNil]): Self =
    copy(router = prefix /: router)

  /** Append the header to the builder, generating a new typed representation of the route */
  //  override def >>>[T2 <: HList](header: TypedHeader[T2])(implicit prep: Prepend[T2, T]): CodecRouter[prep.Out, R] = ???

  override def makeRoute(action: Action[F, R :: T]): RhoRoute[F, M, R :: T] = RhoRoute(this, action)

  override val path: PathRule = router.path

  override def method: Method = router.method

  override val rules: RequestRule[F] = router.rules

  override def decoding[R2 >: R](decoder2: EntityDecoder[F, R2])(implicit
      F: Functor[F],
      t: M[R2]): CodecRouter[F, M, T, R2] =
    CodecRouter(router, decoder.orElse(decoder2))

  def withMethod(other: Method): Self =
    copy(router = router.withMethod(other))
}
