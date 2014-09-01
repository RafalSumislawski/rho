package org.http4s
package rho

import bits.HListToFunc
import shapeless.HList

import scalaz.concurrent.Task

/** Object which can be compiled into a complete route
 * The [[RouteExecutable]] is a complete set of HTTP method, path, query, and headers
  * needed for a compiler to generate a complete route description.
 * @tparam T the HList representation of the types the route expects to extract
  *           from a [[Request]]
 */
trait RouteExecutable[T <: HList] extends TypedBuilder[T] {

  /** [[Method]] of the incoming HTTP [[Request]] */
  def method: Method

  /** Create a [[RhoAction]] from this [[RouteExecutable]] with the provided converters */
  def makeAction[F](f: F, hf: HListToFunc[T, F]): RhoAction[T, F]

  /** Compiles a HTTP request definition into an action */
  final def |>>[F, R](f: F)(implicit hf: HListToFunc[T, F], srvc: CompileService[F, R]): R =
    srvc.compile(makeAction(f, hf))

  /** Provide an action from which to generate a complete route
    * @param f "function" used to in compiling the route
    * @param hf converter used to join the `HList` generated by the route to the function `f`
    * @tparam F the type of `f`
    * @tparam O the type of the result generated by `f`
    * @return a function `Request => Option[Task[Response]]` which can be used as a complete route
    */
  final def runWith[F, O](f: F)(implicit hf: HListToFunc[T, F]): Request => Option[Task[Response]] =
    new RouteExecutor().compile(makeAction(f, hf))
}