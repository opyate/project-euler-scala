package com.opyate.tools.primes

/**
 * http://stackoverflow.com/questions/4595941/scala-performance-sieve/4597680#4597680
 *
 * @author Juan Uys
 */

object InfiniteStreamPrimes {

  val primes = 2 #:: sieve(3)

  def sieve(n: Int): Stream[Int] =
    if (primes.takeWhile(p => p * p <= n).exists(n % _ == 0)) sieve(n + 2)
    else n #:: sieve(n + 2)

  def getPrimes(maxNum: Int) = primes.takeWhile(_ < maxNum)
}

