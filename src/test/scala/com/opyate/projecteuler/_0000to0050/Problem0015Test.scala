package com.opyate.projecteuler._0000to0050

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

class Problem0015Test extends FlatSpec with ShouldMatchers {

  "The number of routes through an n*n grid from NW tip to SE tip" should "be 137846528820 for n=20" in {
    Problem0015.answer(Some(BigInt(20))) should equal (BigInt("137846528820"))
  }
  it should "be 2 for n=1" in {
    Problem0015.answer(Some(1)) should equal (2)
  }
  it should "be 6 for n=2" in {
    Problem0015.answer(Some(2)) should equal (6)
  }
  it should "be 20 for n=3" in {
    Problem0015.answer(Some(3)) should equal (20)
  }
  it should "be 70 for n=4" in {
    Problem0015.answer(Some(4)) should equal (70)
  }
  it should "be 252 for n=5" in {
    Problem0015.answer(Some(5)) should equal (252)
  }
}