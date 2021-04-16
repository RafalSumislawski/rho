package org.http4s.rho.bits

import org.http4s.Status
import scala.reflect.runtime.universe.Type

/** Information about the response type */
sealed trait ResultInfo

case class TypeOnly(tpe: Type) extends ResultInfo

case class StatusAndType[M[_]](status: Status, tpe: M[_]) extends ResultInfo

case class StatusOnly(status: Status) extends ResultInfo
