package com.opyate.tools

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 * Tests for miscellaneous tools
 *
 * @author Juan Uys
 */

class MiscToolsSpec extends FlatSpec with ShouldMatchers {

  "The number of factors" should "equal 2 for the number 2" in {
    MiscToolsLargenumbers.nFactorsQuick(BigInt(2)) should equal (2)
  }
  it should "equal 2 for the number 3" in {
    MiscToolsLargenumbers.nFactorsQuick(BigInt(3)) should equal (2)
  }
  it should "equal 3 for the number 4" in {
    MiscToolsLargenumbers.nFactorsQuick(BigInt(4)) should equal (3)
  }
  it should "equal 25 for the number 10000" in {
    MiscToolsLargenumbers.nFactorsQuick(BigInt(10000)) should equal (25)
  }
  it should "equal 36 for the number 100000" in {
    MiscToolsLargenumbers.nFactorsQuick(BigInt(100000)) should equal (36)
  }
}