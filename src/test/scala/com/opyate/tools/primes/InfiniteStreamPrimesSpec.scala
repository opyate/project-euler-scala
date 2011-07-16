package com.opyate.tools.primes

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

// Stream.Cons(head, Stream.Empty)

class InfiniteStreamPrimesSpec extends FlatSpec with ShouldMatchers {
  "InfiniteStreamPrimes" should "return 2 for last prime below 3" in {
    InfiniteStreamPrimes.getPrimes(3).last should equal (2)
  }
  it should "return 3 for last prime below 4" in {
    InfiniteStreamPrimes.getPrimes(4).last should equal (3)
  }
  it should "return 5 for last prime below 6" in {
    InfiniteStreamPrimes.getPrimes(6).last should equal (5)
  }
}