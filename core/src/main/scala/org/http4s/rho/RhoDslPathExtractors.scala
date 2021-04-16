package org.http4s.rho

import org.http4s.rho.bits.PathAST._
import org.http4s.rho.bits._
import org.http4s.rho.RhoDslPathExtractors._
import shapeless.{::, HNil}

trait RhoDslPathExtractors[F[_], M[_]] {

  implicit def pathMatch(s: String): TypedPath[F, M, HNil] = TypedPath(PathMatch(s))

  /** Provides 'pathVar syntax for String path variables (Scala 2.12 only)
    */
  implicit def pathCapture(s: Symbol)(implicit stringModel: M[String]): TypedPath[F, M, String :: HNil] =
    TypedPath(PathCapture(s.name, None, StringParser.strParser[F, M], stringModel))

  /** Provides pv"pathVarName" syntax for String path variables as an alternative for 'pathVar (Symbol) syntax which was removed in Scala 2.13.
    */
  implicit def pathCapture(sc: StringContext): PathCaptureStringContext[F, M] =
    new PathCaptureStringContext[F, M](sc)

//  /** Defines a path variable of a URI that should be bound to a route definition
//    */
//  def pathVar[T](implicit parser: StringParser[F, T], m: M[T]): TypedPath[F, M, T :: HNil] =
//    pathVar(m.tpe.toString.toLowerCase)(parser)

  /** Defines a path variable of a URI that should be bound to a route definition
    */
  def pathVar[T](id: String)(implicit stringModel: M[String], parser: StringParser[F, M, T]): TypedPath[F, M, T :: HNil] =
    TypedPath(PathCapture[F, M](id, None, parser, stringModel))

  /** Defines a path variable of a URI with description that should be bound to a route definition
    */
  def pathVar[T](id: String, description: String)(implicit
      stringModel: M[String],
      parser: StringParser[F, M, T]): TypedPath[F, M, T :: HNil] =
    TypedPath(PathCapture[F, M](id, Some(description), parser, stringModel))

}

object RhoDslPathExtractors {

  class PathCaptureStringContext[F[_], M[_]](val sc: StringContext) extends AnyVal {
    def pv()(implicit stringModel: M[String]): TypedPath[F, M, String :: HNil] =
      TypedPath[F, M, String :: HNil](
        PathCapture(sc.parts.mkString, None, StringParser.strParser[F, M], stringModel)
      )
  }
}
