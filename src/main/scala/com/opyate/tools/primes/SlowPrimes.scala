package com.opyate.tools.primes

import com.opyate.tools.MiscTools._

/**
 * Simple/inefficient prime algos.
 *
 * @author Juan Uys
 */

@deprecated(message = "Slow and inefficient", since = "11")
object SlowPrimes {

  def primes(nums: Stream[Int]): Stream[Int] =
    Stream.cons(nums.head, primes ((nums tail) filter (x => x % nums.head != 0)) )

  def sieve_eratosthenes = primes(ints(2))

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
}