package com.opyate.tools

/**
 * Factorial (!)
 *
 * @author Juan Uys
 */

object Factorial {
  implicit def pimp(n:Int) = new {
    def ! = ((1 to n) :\ 1) (_*_)
  }
  implicit def pimp(n:BigInt) = new {
    def ! = Range.BigInt(BigInt(1), n+1, BigInt(1)).foldLeft(BigInt(1))(_*_)
  }
}