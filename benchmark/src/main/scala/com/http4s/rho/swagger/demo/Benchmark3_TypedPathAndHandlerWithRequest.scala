package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.Request
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark3_TypedPathAndHandlerWithRequest[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (request: Request[F], a: String, b: String, c: String, d: String) =>
      Ok(s"ok $a $b $c $d $request")
    }

    ()
  }
}


