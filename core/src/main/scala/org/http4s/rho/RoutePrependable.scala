package org.http4s.rho

import org.http4s.rho.bits.PathAST.TypedPath
import shapeless.HNil

/** Types that extends this trait can be prepended with noncapturing paths */
trait RoutePrependable[F[_], M[_], T <: RoutePrependable[F, M, T]] {

  /** Prepend the prefix to the path rules
    *
    * @param prefix non-capturing prefix to prepend
    * @return builder with the prefix prepended to the path rules
    */
  def /:(prefix: TypedPath[F, M, HNil]): T
}
