package com.opyate.tools



/**
 * http://stackoverflow.com/questions/2427759/project-euler-7-scala-problem/2430292#2430292
 *
 * @author Juan Uys
 */

class Primes(bufsize: Int) {
  var n = 1
  val pbuf = new Array[Int](bufsize max 1)
  pbuf(0) = 2
  def isPrime(num: Int): Boolean = {
    var i = 0
    while (i < n && pbuf(i)*pbuf(i) <= num) {
      if (num % pbuf(i) == 0) return false
      i += 1
    }
    if (pbuf(i)*pbuf(i) < num) {
      i = pbuf(i)
      while (i*i <= num) {
        if (num % i == 0) return false
        i += 2
      }
    }
    return true;
  }
  def fillBuf {
    var i = 3
    n = 1
    while (n < bufsize) {
      if (isPrime(i)) { pbuf(n) = i; n += 1 }
      i += 2
    }
  }
  def lastPrime = { if (n<bufsize) fillBuf ; pbuf(pbuf.length-1) }
}
//object Primes {
//  def timedGet(num: Int) = {
//    val t0 = System.nanoTime
//    val p = (new Primes(num)).lastPrime
//    val t1 = System.nanoTime
//    (p , (t1-t0)*1e-9)
//  }
//}