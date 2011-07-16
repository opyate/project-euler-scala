package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0012Test extends FlatSpec with ShouldMatchers {

  // TODO is this correct?
//  "The smallest triangle number" should "be 3 for the triangle number having over 1 divisors" in {
//    Problem0012.answer(Some(1)) should equal (BigInt("3"))
//  }
  "The smallest triangle number" should "be 3 for the triangle number having over 2 divisors" in {
    Problem0012.answer(Some(2)) should equal (BigInt("3"))
  }
  it should "be 6 for the triangle number having over 3 divisors" in {
    Problem0012.answer(Some(3)) should equal (BigInt("6"))
  }
  it should "be 6 for the triangle number having over 4 divisors" in {
    Problem0012.answer(Some(4)) should equal (BigInt("6"))
  }
  it should "be 28 for the triangle number having over 5 divisors" in {
    Problem0012.answer(Some(5)) should equal (BigInt("28"))
  }
  it should "be 28 for the triangle number having over 6 divisors" in {
    Problem0012.answer(Some(6)) should equal (BigInt("28"))
  }
  it should "be 36 for the triangle number having over 7 divisors" in {
    Problem0012.answer(Some(7)) should equal (BigInt("36"))
  }
  it should "be 73920 for the triangle number having over 100 divisors" in {
    Problem0012.answer(Some(100)) should equal (BigInt("73920"))
  }
  it should "be 749700 for the triangle number having over 150 divisors" in {
    Problem0012.answer(Some(150)) should equal (BigInt("749700"))
  }
  it should "be 2031120 for the triangle number having over 200 divisors" in {
    Problem0012.answer(Some(200)) should equal (BigInt("2031120"))
  }
  it should "be 76576500 for the triangle number having over 500 divisors" in {
    Problem0012.answer(Some(500)) should equal (BigInt("76576500"))
  }

}