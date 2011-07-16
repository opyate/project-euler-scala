package com.opyate.tools

import annotation.tailrec

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

  // give a stream of integers from 'n' onwards
  def ints(n: Int): Stream[Int] = Stream.cons(n, ints(n+1))

  // problem 12, Triangle Number (trn)
  // returns (nth triangle number, the triangle number)
  // e.g. (7,28)
  lazy val trn: Stream[(Int, BigInt)] =
    Stream.cons(
      (1,1),
      Stream.cons((2,3), trn.zip(trn.tail).map(p => (p._2._1 + 1, p._2._2 + p._2._1 + 1))))

  // factorise a number, with tailrec
  def factorise(n: Int): List[Int] = {
    @tailrec
    def factoriseAcc(cn: Int, p: Int, factors: List[Int]): List[Int] = {
      if (n == 1) factors
      else if (n % p == 0) factoriseAcc (n/p, p, p::factors)
      else factoriseAcc(n, p+1, factors)
    }
    factoriseAcc(n, 2, Nil)
  }

  // factors
  def factors(number: Int): List[Int] = (1 to number) filter (number % _ == 0) toList

  // how many factors? (when we don't need the actual factors)
  def nfactors(number: Int): Int = {
    var x = 1
    (1 to number).map(i => {
      if (number % i == 0)
        x = x+1
      else {}
    })
    x
  }



}

