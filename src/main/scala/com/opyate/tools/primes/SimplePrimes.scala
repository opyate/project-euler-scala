package com.opyate.tools.primes

import com.opyate.tools.MiscTools._

/**
 * Simple prime thingies.
 *
 * @author Juan Uys
 */

object SimplePrimes {

  def primes(nums: Stream[Int]): Stream[Int] =
    Stream.cons(nums.head, primes ((nums tail) filter (x => x % nums.head != 0)) )

  def sieve = primes(ints(2))

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
}