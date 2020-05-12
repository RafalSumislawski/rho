package com.http4s.rho.swagger.demo

import cats.effect.Effect
import com.http4s.rho.swagger.demo.MyRoutes.JsonResult
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark4_TypedPathAndHandlerWithJson[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import JsonEncoder._
  import cats.implicits._
  ().pure[F]
  
  
  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }

  val _ = () => {
    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
      JsonResult(s"$a $b", s"$c $d".hashCode)
    }

    ()
  }
}


