package com.opyate

import tools.primes.InfiniteStreamPrimes
import tools.Timer
import Timer._



/**
 * Calculate the sum of all the primes below two million.
 *
 * @author Juan Uys
 */

object Problem0010 extends App {

  def answer = {
    //InfiniteStreamPrimes.getPrimes(2000000).sum
    //sieve.takeWhile(_ < 200000).foldLeft(0)(_+_)
    var i = BigInt(0)
    InfiniteStreamPrimes.getPrimes(2000000).foldLeft(i)(_+_)
  }

  go
  println(answer)
  stop
}