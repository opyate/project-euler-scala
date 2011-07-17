package com.opyate.projecteuler._0000to0050

import com.opyate.tools.primes.InfiniteStreamPrimes
import com.opyate.projecteuler.ProjectEuler


/**
 * Find the longest sequence using a starting number under one million.
 *
 * @author Juan Uys
 */

object Problem0014 extends ProjectEuler[Int, Int] {

  def answer(input: Option[Int]) = {
    def chainSize(startingNumber: BigInt): BigInt = {
      @scala.annotation.tailrec
      def seq(n: BigInt, size: BigInt): BigInt = n match {
        case i if i%2 == 0 => seq(i/2, size+1)
        case i if i!=1 => seq(BigInt(3)*i + BigInt(1), size+1)
        case i => size
      }
      seq(startingNumber, BigInt(1))
    }

    var x = (0, BigInt(0))
    //(1 until input.get).sortBy(chainSize(_)).last
    (1 until input.get).foreach(i => {val j = chainSize(i); if (j>x._2) x=(i,j) else x})
    x._1
  }
}