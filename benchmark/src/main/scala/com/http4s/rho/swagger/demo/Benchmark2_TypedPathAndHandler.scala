package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark2_TypedPathAndHandler[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      Ok(s"ok $a $b $c $d")
//    }
//
//    ()
//  }
}


