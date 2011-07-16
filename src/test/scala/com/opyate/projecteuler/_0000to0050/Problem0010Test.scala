package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0010Test extends FlatSpec with ShouldMatchers {

  "The sum of all primes" should "be 142913828922 for all primes below two million" in {
    Problem0010.answer(Some(2000000)) should equal (BigInt("142913828922"))
  }
}