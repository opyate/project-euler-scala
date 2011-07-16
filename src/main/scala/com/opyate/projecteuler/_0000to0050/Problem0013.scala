package com.opyate.projecteuler._0000to0050

import com.opyate.tools.MiscTools._
import com.opyate.tools.MiscToolsLargenumbers._
import com.opyate.projecteuler.ProjectEuler

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *
 * @author Juan Uys
 */

object Problem0013 extends ProjectEuler[String, String] {

  def answer(input: Option[String]) = {
    input.get.split('\n').foldLeft(BigInt(0)){(acc: BigInt,s) => acc + BigInt(s)}.toString.substring(0,10)
  }
}