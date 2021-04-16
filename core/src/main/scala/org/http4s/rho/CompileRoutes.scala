package org.http4s
package rho

import scala.collection.immutable.Seq
import cats._
import shapeless.HList
import org.http4s.rho.RhoRoute.Tpe
import org.http4s.rho.bits.PathTree

/** Transforms a [[RhoRoute]] into an `RouteType`.
  *
  * This can be a stateful operation, storing the action for later execution
  * or any other type of compilation phase.
  */
trait CompileRoutes[F[_], M[_], RouteType] {

  /** Transform the [[RhoRoute]] into a `RouteType` possibly mutating this compilers state.
    *
    * @param route [[RhoRoute]] to compile.
    * @tparam T `HList` representation of the result of the route
    * @return The result of the compilation process.
    */
  def compile[T <: HList](route: RhoRoute[F, M, T]): RouteType
}

object CompileRoutes {

  /** [[CompileRoutes]] that simply returns its argument */
  def identityCompiler[F[_], M[_]]: CompileRoutes[F, M, Tpe[F, M]] = new CompileRoutes[F, M, RhoRoute.Tpe[F, M]] {
    def compile[T <: HList](route: RhoRoute[F, M, T]): RhoRoute[F, M, T] = route
  }

  /** Importable implicit identity compiler */
  object Implicit {
    implicit def compiler[F[_], M[_]]: CompileRoutes[F, M, RhoRoute.Tpe[F, M]] = identityCompiler[F, M]
  }

  /** Convert the `Seq` of [[RhoRoute]]'s into a `HttpRoutes`
    *
    * @param routes `Seq` of routes to bundle into a service.
    * @return An `HttpRoutes`
    */
  def foldRoutes[F[_]: Defer: Monad, M[_]](routes: Seq[RhoRoute.Tpe[F, M]]): HttpRoutes[F] = {
    val tree = routes.foldLeft(PathTree[F, M]())((t, r) => t.appendRoute(r))
    HttpRoutes((req: Request[F]) => tree.getResult(req).toResponse)
  }
}
