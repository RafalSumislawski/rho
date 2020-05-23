package com.http4s.rho.swagger.demo

import cats.effect.Effect
import org.http4s.{Entity, EntityEncoder, Headers}
import org.http4s.rho.RhoRoutes
import org.http4s.rho.swagger.SwaggerSyntax

class Benchmark5_TypedPathAndComplexResult[F[+ _] : Effect]() extends RhoRoutes[F] with SwaggerSyntax[F] {

  import cats.implicits._
  ().pure[F]

//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
//
//  val _ = () => {
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    GET / "a" / pv"a" / "b" / pv"b" / "c" / pv"c" / "c" / pv"d" |>> { (a: String, b: String, c: String, d: String) =>
//      if(a.startsWith("a")) Ok(b + c + d) else if(a.startsWith("b")) Accepted(()) else if(a.startsWith("b")) NotFound(Array[Byte](1)) else BadRequest(Array[Char]('a'))
//    }
//
//    ()
//  }
}


