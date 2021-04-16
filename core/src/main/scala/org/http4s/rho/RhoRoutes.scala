package org.http4s
package rho

import scala.collection.immutable.Seq
import cats._
import org.http4s.rho.bits.PathAST.TypedPath
import org.log4s.getLogger
import shapeless.{HList, HNil}

/** Constructor class for defining routes
  *
  * The [[RhoRoutes]] provides a convenient way to define routes in a style
  * similar to scalatra etc by providing implicit conversions and an implicit
  * [[CompileRoutes]] inside the constructor.
  *
  * {{{
  *   new RhoRoutes[IO] {
  *     POST / "foo" / pathVar[Int] +? param[String]("param") |>> { (p1: Int, param: String) =>
  *       Ok("success")
  *     }
  *   }
  * }}}
  *
  * @param routes Routes to prepend before elements in the constructor.
  */
class RhoRoutes[F[_]: Defer: Monad, M[_]](routes: Seq[RhoRoute[F, M, _ <: HList]] = Vector.empty)
    extends bits.MethodAliases
    with bits.ResponseGeneratorInstances[F]
    with RoutePrependable[F, M, RhoRoutes[F, M]]
    with RhoDsl[F, M] {
  final private val routesBuilder = RoutesBuilder[F, M](routes)

  final protected val logger = getLogger

  final implicit protected def compileRoutes: CompileRoutes[F, M, RhoRoute.Tpe[F, M]] = routesBuilder

  /** Create a new [[RhoRoutes]] by appending the routes of the passed [[RhoRoutes]]
    *
    * @param other [[RhoRoutes]] whos routes are to be appended.
    * @return A new [[RhoRoutes]] that contains the routes of the other service appended
    *         the the routes contained in this service.
    */
  final def and(other: RhoRoutes[F, M]): RhoRoutes[F, M] = new RhoRoutes(
    this.getRoutes ++ other.getRoutes
  )

  /** Get a snapshot of the collection of [[RhoRoute]]'s accumulated so far */
  final def getRoutes: Seq[RhoRoute[F, M, _ <: HList]] = routesBuilder.routes()

  /** Convert the [[RhoRoute]]'s accumulated into a `HttpRoutes` */
  final def toRoutes(middleware: RhoMiddleware[F, M] = identity): HttpRoutes[F] =
    routesBuilder.toRoutes(middleware)

  final override def toString: String = s"RhoRoutes(${routesBuilder.routes().toString()})"

  final override def /:(prefix: TypedPath[F, M, HNil]): RhoRoutes[F, M] =
    new RhoRoutes(routesBuilder.routes().map(prefix /: _))
}
