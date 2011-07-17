package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0017Test extends FlatSpec with ShouldMatchers {

  "The number of letters" should "be 3 for numbers 1 up to 1 written in English" in {
    Problem0017.answer(Some(1)) should equal (3)
  }
  it should "be 6 for numbers 1 up to 2 written in English" in {
    Problem0017.answer(Some(2)) should equal (6)
  }
  it should "be 19 for numbers 1 up to 5 written in English" in {
    Problem0017.answer(Some(5)) should equal (19)
  }
  it should "be 21124 for numbers 1 up to 1000 written in English" in {
    Problem0017.answer(Some(1000)) should equal (21124)
  }
}