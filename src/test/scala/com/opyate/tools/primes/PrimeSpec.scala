package com.opyate.tools.primes

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import com.opyate.tools.Prime

/**
 * Tests for prime number tools.
 *
 * @author Juan Uys
 */
class PrimeSpec extends FlatSpec with ShouldMatchers {
  "Prime" should "generate empty list for 1" in {
    Prime.prime_factors(1) should equal (List[Int]())
  }
  it should "generate a list with 2 in it for 2" in {
    Prime.prime_factors(2) should equal (List[Int](2))
  }
  it should "generate a list with 3 in it for 3" in {
    Prime.prime_factors(3) should equal (List[Int](3))
  }
  it should "generate a list with 2 and 2 in it for 4" in {
    Prime.prime_factors(4) should equal (List[Int](2, 2))
  }
  it should "generate a list with 2 and 3 in it for 6" in {
    Prime.prime_factors(6) should equal (List[Int](2, 3))
  }
  it should "generate a list with three 2s for 8" in {
    Prime.prime_factors(8) should equal (List[Int](2, 2, 2))
  }
  it should "generate a list with two 3s for 9" in {
    Prime.prime_factors(9) should equal (List[Int](3, 3))
  }
  it should "generate a list with five 2s and five 5s for 100000" in {
    Prime.prime_factors(100000) should equal (List[Int](2, 2, 2, 2, 2, 5, 5, 5, 5, 5))
  }

}