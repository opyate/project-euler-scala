package com.opyate.projecteuler._0000to0050

import com.opyate.projecteuler.ProjectEuler
import com.opyate.tools.Factorial._


/**
 * The sum of the digits of a number (where the number can be
 * given by some expression, e.g. 2^15 = 32768
 * and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * @author Juan Uys
 */

object Problem0016 extends ProjectEuler[BigInt, BigInt] {

  def answer(input: Option[BigInt]) = {
    val n = input.get

    n.toString.foldLeft(0){(acc,i) => acc + i.toString.toInt}
  }
}