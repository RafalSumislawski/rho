package org.http4s.rho

import scala.collection.immutable.VectorBuilder
import scala.collection.immutable.Seq
import cats._
import shapeless.HList
import org.http4s._

import scala.collection.compat._

/** CompileRoutes which accumulates routes and can build a `HttpRoutes` */
final class RoutesBuilder[F[_]: Defer: Monad, M[_]] private (
    internalRoutes: VectorBuilder[RhoRoute.Tpe[F, M]])
    extends CompileRoutes[F, M, RhoRoute.Tpe[F, M]] {

  /** Turn the accumulated routes into an `HttpRoutes`
    *
    * @param middleware [[RhoMiddleware]] to apply to the collection of routes.
    * @return An `HttpRoutes` which can be mounted by http4s servers.
    */
  def toRoutes(middleware: RhoMiddleware[F, M] = identity): HttpRoutes[F] =
    CompileRoutes.foldRoutes(middleware.apply(internalRoutes.result()))

  /** Get a snapshot of the currently acquired routes */
  def routes(): Seq[RhoRoute.Tpe[F, M]] = internalRoutes.result()

  /** Append the routes into this [[RoutesBuilder]]
    *
    * @param routes Routes to accumulate.
    * @return `this` instance with its internal state mutated.
    */
  def append(routes: IterableOnce[RhoRoute.Tpe[F, M]]): this.type = {
    internalRoutes ++= routes.iterator.to(Iterable)
    this
  }

  /** Accumulate the [[RhoRoute]] into this [[RoutesBuilder]]
    *
    * This is the same as appending a the single route and returning the same route.
    *
    * @param route [[RhoRoute]] to compile.
    * @tparam T `HList` representation of the result of the route
    * @return The [[RhoRoute]] passed to the method.
    */
  override def compile[T <: HList](route: RhoRoute[F, M, T]): RhoRoute[F, M, T] = {
    internalRoutes += route
    route
  }
}

object RoutesBuilder {

  /** Constructor method for new `RoutesBuilder` instances */
  def apply[F[_]: Defer: Monad, M[_]](): RoutesBuilder[F, M] = apply(Seq.empty)

  /** Constructor method for new `RoutesBuilder` instances with existing routes */
  def apply[F[_]: Defer: Monad, M[_]](routes: Seq[RhoRoute.Tpe[F, M]]): RoutesBuilder[F, M] = {
    val builder = new VectorBuilder[RhoRoute.Tpe[F, M]]
    builder ++= routes

    new RoutesBuilder(builder)
  }
}
