package com.opyate

import tools.primes.InfiniteStreamPrimes
import tools.Timer
import Timer._

import com.opyate.tools.db.File._

/**
 * Calculate the sum of all the primes below two million.
 *
 * @author Juan Uys
 */

object Problem0010 extends App {

  def answer = {
    //InfiniteStreamPrimes.getPrimes(2000000).sum
    sieve.takeWhile(_ < 2000000).sum
  }

  go
  println(answer)
  stop
}