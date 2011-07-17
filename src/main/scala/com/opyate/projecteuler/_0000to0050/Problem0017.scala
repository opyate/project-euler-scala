package com.opyate.projecteuler._0000to0050

import com.opyate.projecteuler.ProjectEuler
import com.opyate.tools.NumberToWord

/**
 * If the numbers 1 to 5 are written out in words:
 * one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 *
 * @author Juan Uys
 */

object Problem0017 extends ProjectEuler[Int, Int] {

  def answer(input: Option[Int]) = {
    val n = input.get

    (1 to n)
        .map(NumberToWord(_))
        .map(_.filter(_ != ' '))
        .map(_.filter(_ != '-'))
        .foldLeft(0){(acc, s) => acc + s.toString.size}
  }
}