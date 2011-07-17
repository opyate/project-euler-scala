package com.opyate.projecteuler._0000to0050

import com.opyate.projecteuler.ProjectEuler
import com.opyate.tools.Factorial._


/**
 * How many routes are there through a 2020 grid?
 * (from top left to bottom right, without backtracking)
 *
 * @author Juan Uys
 */

object Problem0015 extends ProjectEuler[BigInt, BigInt] {

  /**
   * http://oeis.org/A000984
   */
  def answer(input: Option[BigInt]) = {
    val n = input.get
    
    ((n * 2)!) / (((n)!).pow(2))
  }
}