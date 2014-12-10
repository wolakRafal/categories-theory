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
  * Created : 10 December 2014
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

/*class ListFunctorTest extends Specification with ScalaCheck {
  import Functor.ListFunctor._

  "A ListFunctor" should {

    "preserve identity" in {
      val stringID = (s: String) => s
      val stringListID = (ss: List[String]) => ss
      Prop forAll { (ss: List[String]) =>
        fmap(stringID)(ss) == stringListID(ss)
      } must pass
    }

    "preserve composition" in {
      val f = (i: Int) => i.toString
      val g = (s: String) => s.length
      Prop forAll { (is: List[Int]) =>
        fmap(g compose f)(is) == (fmap(g) compose fmap(f))(is)
      } must pass
    }
  }
}*/
