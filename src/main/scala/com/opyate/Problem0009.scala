package com.opyate

import com.opyate.tools.Timer._

/**
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc
 *
 * @author Juan Uys
 */

object Problem0009 extends App {

  def triplet =
    (for (m <- (1 until 100); n <- (1 until 100); val (x,y) = (m,n) if (m > n)) yield (x,y))
      .map{p => {val m = p._1; val n = p._2; (m*m-n*n, 2*m*n, m*m+n*n)}}
      .filter(t => t._1 + t._2 + t._3 == 1000)
      .head
      .productIterator.toList
  
  def answer = triplet.foldLeft(1)((prod, n) => {prod.asInstanceOf[Int] * n.asInstanceOf[Int]})

  go
  println(answer)
  stop
}