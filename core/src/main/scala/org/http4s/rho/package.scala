package org.http4s

import scala.collection.immutable.Seq
import org.http4s.rho.{
  PathBuilder,
  PathEmpty,
  ResultSyntaxInstances,
  RhoDslHeaderExtractors,
  RhoDslPathExtractors,
  RhoDslQueryParamExtractors
}
import org.http4s.rho.bits._
import org.http4s.rho.bits.PathAST._
import shapeless.{HList, HNil}

package object rho extends org.http4s.syntax.AllSyntax {
  type RhoMiddleware[F[_], M[_]] = Seq[RhoRoute[F, M, _ <: HList]] => Seq[RhoRoute[F, M, _ <: HList]]

  val PathEmpty: PathRule = PathMatch("")
}

trait RhoDsl[F[_], M[_]]
    extends RhoDslQueryParamExtractors[F, M]
    with RhoDslPathExtractors[F,  M]
    with RhoDslHeaderExtractors[F]
    with ResultSyntaxInstances[F]
    with QueryParsers[F, M]
    with MatchersHListToFunc[F]
    with FuncParamsMatchers[F]
    with ResponseGeneratorInstances[F]
    with FailureResponseOps[F]
    with ResultMatchers[F, M] {

  implicit def method(m: Method): PathBuilder[F, M, HNil] = new PathBuilder(m, PathEmpty)

  /** Helper to be able to define a path with one level only.
    * {{{
    * val hello = Root / "hello"
    * }}}
    */
  def root: TypedPath[F, M, HNil] = TypedPath(PathEmpty)

  def * : CaptureTail.type = CaptureTail
}

object RhoDsl {
  def apply[F[_], M[_]]: RhoDsl[F, M] = new RhoDsl[F, M] {}
}
