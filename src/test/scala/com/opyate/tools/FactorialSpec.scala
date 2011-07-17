package com.opyate.tools

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Factorial tests.
 *
 * @author Juan Uys
 */

class FactorialSpec extends FlatSpec with ShouldMatchers {
  import com.opyate.tools.Factorial._

  "The factorial of n" should "equal 1 for n=1" in {
    (1!) should equal (1)
    (BigInt(1)!) should equal (BigInt(1))
  }
  it should "equal 2 for n=2" in {
    (2!) should equal (2)
    (BigInt(2)!) should equal (BigInt(2))
  }
  it should "equal 6 for n=3" in {
    (3!) should equal (6)
    (BigInt(3)!) should equal (BigInt(6))
  }
  it should "equal 24 for n=4" in {
    (4!) should equal (24)
    (BigInt(4)!) should equal (BigInt(24))
  }
  it should "equal 120 for n=5" in {
    (5!) should equal (120)
    (BigInt(5)!) should equal (BigInt(120))
  }
  it should "equal 3628800 for n=10" in {
    (10!) should equal (3628800)
    (BigInt(10)!) should equal (BigInt(3628800))
  }
  it should "equal 30414093201713378043612608166064768844377641568960512000000000000 for n=50" in {
    (BigInt(50)!) should equal (BigInt("30414093201713378043612608166064768844377641568960512000000000000"))
  }
  it should "equal 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000 for n=100" in {
    (BigInt(100)!) should equal (BigInt("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"))
  }
}