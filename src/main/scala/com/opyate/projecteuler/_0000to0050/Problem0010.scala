package com.opyate.projecteuler._0000to0050

import com.opyate.tools.Timer._
import com.opyate.tools.primes.InfiniteStreamPrimes
import com.opyate.projecteuler.ProjectEuler


/**
 * Calculate the sum of all the primes below two million.
 *
 * @author Juan Uys
 */

object Problem0010 extends ProjectEuler[Int, BigInt] {

  def answer(input: Option[Int]) = {
    InfiniteStreamPrimes.getPrimes(input.get).foldLeft(BigInt(0))(_+_)
  }
}