package com.opyate.tools

/**
 * Bits of useful functionality as I solve Project Euler problems.
 *
 * Could be moved elsewhere if it makes sense to.
 *
 * @author Juan Uys
 */

object MiscTools {

  lazy val fib: Stream[Int] = Stream.cons(0,
     Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))

  lazy val naturalNums: Stream[Int] = Stream.cons(1, naturalNums.map(_ + 1))

  def ints(n: Int): Stream[Int] =
    Stream.cons(n, ints(n+1))


}