package com.opyate.projecteuler._0000to0050

import com.opyate.tools.Timer._
import scala.math.sqrt
import com.opyate.projecteuler.ProjectEuler

/**
 * What is the greatest product of 4 adjacent numbers in any direction
 * (up, down, left, right, or diagonally) in the 20x20 grid?
 *
 * TODO adapt to accept n*m grid and x adjacent numbers.
 *
 * @author Juan Uys
 */

object Problem0011 extends ProjectEuler[String, Int] {

  def answer(in: Option[String]) = {
    val input = in.get.split('\n').flatMap(_.split(' ')).map(_.toInt)

    // the dimensions of this square grid of data
    val dimension = sqrt(input.size).toInt

    // the puzzle asks for 4 adjacent numbers
    val adj = 4

    // build up a set of lists where each list contains 'adj' elements
    var combos = scala.collection.immutable.HashSet[List[Int]]()

    // for each number, grab the:
    // horizontal to the right
    // the vertical to the bottom
    // and the diagonal to the bottom right and left
    // No need to go left and up, since this would be covered

    // 340 combinations of 4 horizontal numbers:
    //val horlist: List[List[Int]] = input.sliding(dimension, dimension).toList
    val horlist = input.sliding(dimension, dimension).toList
    for {
      subsublist <- horlist
      i <- (0 to subsublist.size)
    } yield {
      if (i+adj-1 < subsublist.size) { // not <=, because 400 will be out of bounds.
        combos += List(subsublist(i), subsublist(i+1), subsublist(i+2), subsublist(i+3))
      }
    }

    // 340 combinations of 4 vertical numbers
    val vertlist = (0 until dimension).map(i => horlist.map(x => x(i)))
    for {
      subsublist <- vertlist
      i <- (0 to subsublist.size)
    } yield {
      if (i+adj-1 < subsublist.size) { // not <=, because 400 will be out of bounds.
        combos += List(subsublist(i), subsublist(i+1), subsublist(i+2), subsublist(i+3))
      }
    }

    // p = (n-x+1)^2
    //   = (dimension - adj + 1) ^ 2
    //   = (20 - 4 + 1) ^ 2
    //   = (17) ^ 2
    //   = 289
    // thus, 289 combinations of right-diagonals
    // and 289 combinations of left diagonals
    // thus 578 extra combinations.s

    def sq(i: Int) = i*i

    (0 to dimension * dimension).map(c1 => {

      // Right diagonals:
      // exclude points which fall in the dead zone, i.e.
      // where a diagonal of length 'adj' originating in c1 goes over the border
      if (!(c1 % 20 > dimension - adj || c1 > (dimension * (dimension - adj+1)) - adj)) {

        val c2: Int = c1 + dimension + 1
        val c3: Int = c2 + dimension + 1
        val c4: Int = c3 + dimension + 1
        val l = List(
            input(c1),
            input(c2),
            input(c3),
            input(c4))
        //println("(%s,%s,%s,%s): %s".format(c1, c2, c3, c4, l))
        combos += l
      }

      // Left diagonals:
      if (!(c1 % 20 < adj-1 || c1 > (dimension * (dimension - adj+1)))) {

        val c2: Int = c1 + dimension - 1
        val c3: Int = c2 + dimension - 1
        val c4: Int = c3 + dimension - 1
        val l = List(
            input(c1),
            input(c2),
            input(c3),
            input(c4))
        //println("(%s,%s,%s,%s): %s".format(c1, c2, c3, c4, l))
        combos += l
      }
    })

    // laslty, find the largest product
    val x: List[Int] = combos.maxBy(l => l.product)

    x.product
  }

}