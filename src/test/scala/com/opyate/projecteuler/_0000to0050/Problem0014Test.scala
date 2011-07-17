package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0014Test extends FlatSpec with ShouldMatchers {

  "The longest chain" should "be 77031 for a starting number under 100000" in {
    Problem0014.answer(Some(100000)) should equal (77031)
  }
  it should "be 837799 for a starting number under 1000000" in {
    Problem0014.answer(Some(1000000)) should equal (837799)
  }
}