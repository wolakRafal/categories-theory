/** ***************************************************************************
  * Copyright (c) 2013
  * ADVA Optical Networking
  *
  * All rights reserved. Any unauthorized disclosure or publication of the
  * confidential and proprietary information to any other party will constitute
  * an infringement of copyright laws.
  *
  * $Id$
  * Author  : Rafal Wolak, RWolak@advaoptical.com
  * Created : 09 December 2014
  * Purpose :
  *
  * $Rev$
  * $URL$
  *
  * Notes:
  *
  * ****************************************************************************
  */

package com.robo.category.theory

import org.scalacheck._
import org.scalatest.{MustMatchers, WordSpec}
import org.specs2.mutable.Specification

class CategorySpec extends WordSpec with MustMatchers {
  import com.robo.category.theory.Category._

  "A Category" should {

    val intGen = Gen[Int]
    val f = (i: Int) => i.toString
    val g = (s: String) => s.length
    val h = (i: Int) => i * i

    "satisfy associativity" in {
      Prop.forAll{ (i: Int) =>
        compose(h, compose(g, f))(i) == compose(compose(h, g), f)(i)
        true
      }
    }

    "satisfy identity" in {
      Prop.forAll{ (i: Int) =>
        compose(f, id[Int])(i) mustEqual compose(id[String], f)(i)
        true
      }
    }
  }
}
