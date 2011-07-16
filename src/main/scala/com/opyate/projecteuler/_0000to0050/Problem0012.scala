package com.opyate.projecteuler._0000to0050

import com.opyate.tools.MiscTools._
import com.opyate.tools.MiscToolsLargenumbers._
import com.opyate.projecteuler.ProjectEuler

/**
 * What is the value of the first triangle number to have over five hundred divisors?
 *
 * @author Juan Uys
 */

object Problem0012 extends ProjectEuler[Int, BigInt] {

  def answer(input: Option[Int]) = {
    trn.dropWhile(i => nFactorsQuick(i._2) < input.get).head._2
  }
}