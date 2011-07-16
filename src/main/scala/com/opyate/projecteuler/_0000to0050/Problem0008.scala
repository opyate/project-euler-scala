package com.opyate.projecteuler._0000to0050

import com.opyate.tools.Timer._
import com.opyate.projecteuler.ProjectEuler

/**
 * Find the greatest product of five consecutive digits in the 1000-digit number.
 *
 * @author Juan Uys
 */
object Problem0008 extends ProjectEuler[String, Int] {

  def answer(input: Option[String]): Int = {
    (for (c <- input.get.replaceAll("\n", ""))
      yield c.toString.toInt).sliding(5,1).toList.flatMap{vec =>
        {List(vec.foldLeft(1)(_*_))}}.sortWith(_>_).head
  }
}