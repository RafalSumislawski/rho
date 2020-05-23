package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.rho.RhoRoutes
import org.http4s.rho.bits.ResultMatcher
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark9_ResultMatcherFString[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

  def findResultMatcher[R](r: R)(implicit m: ResultMatcher[F, R]): Unit = {val _ = r; ()}


//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    findResultMatcher("".pure[F])
//    ()
//  }

}


