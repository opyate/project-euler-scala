package com.opyate.tools.primes

/**
 * http://stackoverflow.com/questions/4595941/scala-performance-sieve/4597680#4597680
 *
 * @author Juan Uys
 */

object InfiniteStreamPrimes {

  private val primes = 2 #:: sieve_eratosthenes(3)

  /**
   * TODO implement sieve of Atkins
   */
  private def sieve_eratosthenes(n: Int): Stream[Int] =
    if (primes.takeWhile(p => p * p <= n).exists(n % _ == 0)) sieve_eratosthenes(n + 2)
    else n #:: sieve_eratosthenes(n + 2)

  def getPrimes(maxNum: Int) = primes.takeWhile(_ < maxNum)
}

