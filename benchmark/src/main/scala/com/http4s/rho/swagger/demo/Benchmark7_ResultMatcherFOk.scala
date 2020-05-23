package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.rho.RhoRoutes
import org.http4s.rho.bits.ResultMatcher
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark7_ResultMatcherFOk[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

  def findResultMatcher[R](r: R)(implicit m: ResultMatcher[F, R]): Unit = {val _ = r; ()}

//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }
//
//  val _ = () => {
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    findResultMatcher(Ok(""))
//    ()
//  }

}


