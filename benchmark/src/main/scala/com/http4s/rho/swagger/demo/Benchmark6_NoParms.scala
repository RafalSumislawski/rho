package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark6_NoParms[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    GET / "a" |>> Ok("")
//    ()
//  }

}


