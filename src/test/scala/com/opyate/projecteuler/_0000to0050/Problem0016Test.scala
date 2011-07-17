package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0016Test extends FlatSpec with ShouldMatchers {

  "The sum of the digits" should "be 26 for the expression 2^15" in {
    Problem0016.answer(Some(BigInt(2).pow(15))) should equal (26)
  }
  it should "be 25 for the expression 2^16" in {
    Problem0016.answer(Some(BigInt(2).pow(16))) should equal (25)
  }
  it should "be 1366 for the expression 2^1000" in {
    Problem0016.answer(Some(BigInt(2).pow(1000))) should equal (1366)
  }
}