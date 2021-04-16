package org.http4s.rho.swagger

import org.http4s.Method
import org.http4s.rho.{PathBuilder, PathEmpty}
import org.http4s.rho.bits.PathAST
import shapeless.HNil

trait SwaggerSyntax[F[_], M[_]] {

  /** Add support for adding documentation to routes using symbolic operators. */
  implicit class StrOps(doc: String) {
    def **(method: Method): PathBuilder[F, M, HNil] =
      **(new PathBuilder[F, M, HNil](method, PathEmpty))

    def **[T <: HNil](builder: PathBuilder[F, M, T]): PathBuilder[F, M, T] =
      new PathBuilder(builder.method, PathAST.MetaCons(builder.path, RouteDesc(doc)))

    def @@(method: Method): PathBuilder[F, M, HNil] =
      @@(new PathBuilder[F, M, HNil](method, PathEmpty))

    def @@[T <: HNil](builder: PathBuilder[F, M, T]): PathBuilder[F, M, T] =
      new PathBuilder(builder.method, PathAST.MetaCons(builder.path, RouteTags(List(doc))))
  }

  /** Add support for adding tags before a route using the @@ operator */
  implicit class ListOps(tags: List[String]) {
    def @@(method: Method): PathBuilder[F, M, HNil] =
      @@(new PathBuilder[F, M, HNil](method, PathEmpty))

    def @@[T <: HNil](builder: PathBuilder[F, M, T]): PathBuilder[F, M, T] =
      new PathBuilder(builder.method, PathAST.MetaCons(builder.path, RouteTags(tags)))
  }
}
