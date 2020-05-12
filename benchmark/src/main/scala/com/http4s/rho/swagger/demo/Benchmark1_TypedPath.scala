package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark1_TypedPath[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d"
    ()
  }
}


