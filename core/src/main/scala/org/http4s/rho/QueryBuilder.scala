package org.http4s
package rho

import bits.{HListToFunc, HeaderAppendable, UriConverter }
import bits.PathAST._
import bits.QueryAST._
import bits.HeaderAST._

import shapeless.ops.hlist.Prepend
import shapeless.{ ::, HList }

case class QueryBuilder[T <: HList](method: Method,
  path: PathRule,
  query: QueryRule)
  extends RouteExecutable[T]
  with HeaderAppendable[T]
  with UriConvertible {
  override type Self = QueryBuilder[T]

  override def makeAction[F](f: F, hf: HListToFunc[T, F]): RhoAction[T, F] =
    RhoAction(Router(method, path, query, headers), f, hf)

  override def >>>[T1 <: HList](v: TypedHeader[T1])(implicit prep1: Prepend[T1, T]): Router[prep1.Out] =
    Router(method, path, query, v.rule)

  def &[T1 <: HList](q: TypedQuery[T1])(implicit prep: Prepend[T1, T]): QueryBuilder[prep.Out] =
    QueryBuilder(method, path, QueryAnd(query, q.rule))

  override def headers: HeaderRule = EmptyHeaderRule

  override val asUriTemplate =
    for {
      p <- UriConverter.createPath(path)
      q <- UriConverter.createQuery(query)
    } yield UriTemplate(path = p, query = Some(q))
}
