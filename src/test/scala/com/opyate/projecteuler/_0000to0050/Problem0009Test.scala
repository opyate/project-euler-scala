package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.{FlatSpec, Suite}

class Problem0009Test extends FlatSpec with ShouldMatchers {

  "The product abc of the Pythagorean triplet (a,b,c)" should "be 31875000 for a + b + c = 1000" in {
    Problem0009.answer(Some(1000)) should equal (31875000)
  }
}