package com.opyate.tools

object Prime {

  /**
   * http://blog.james-carr.org/2010/05/24/scala-prime-factors-kata/
   */
  @deprecated(message = "Slow", since = "11")
  def factors_imperative(n: Int) = {
    var x = n
    var factors = List[Int]()
    for (i <- 2 to n)
      while (x % i == 0 && x / i > 1) {
        factors :+= i
        x /= i
      }
    if (x > 1)
      factors :+= x
    factors
  }

  /**
   * http://louisbotterill.blogspot.com/2009/03/prime-factorization-comparison-between.html
   *
   * Much quicker than imperative equivalent.
   */
  def prime_factors(n: Int) = {
    def divides(d: Int, n: Int) = {
      (n % d) == 0
    }

    def ld(n: Int): Int = {
      ldf(2, n)
    }

    def ldf(k: Int, n: Int): Int = {
      if (divides(k, n)) k
      else if ((k * k) > n) n
      else ldf((k + 1), n)
    }

    def factors(n: Int): List[Int] = n match {
      case 1 => Nil;
      case _ => {
        val p = ld(n)
        p :: factors(n / p)
      }
    }

    factors(n)
  }

  def prime_factors(n: BigInt) = {
    val One = BigInt(1)
    
    def divides(d: BigInt, n: BigInt) = {
      (n % d) == 0
    }

    def ld(n: BigInt): BigInt = {
      ldf(2, n)
    }

    def ldf(k: BigInt, n: BigInt): BigInt = {
      if (divides(k, n)) k
      else if ((k * k) > n) n
      else ldf((k + 1), n)
    }

    def factors(n: BigInt): List[BigInt] = n match {
      case One => Nil;
      case _ => {
        val p = ld(n)
        p :: factors(n / p)
      }
    }

    factors(n)
  }

}

object PrimeStream {
  private val primes = 2 #:: sieve_eratosthenes(3)

  /**
   * TODO implement sieve of Atkins
   */
  private def sieve_eratosthenes(n: Int): Stream[Int] =
    if (primes.takeWhile(p => p * p <= n).exists(n % _ == 0)) sieve_eratosthenes(n + 2)
    else n #:: sieve_eratosthenes(n + 2)

  def smallerThan(maxNum: Int) = primes.takeWhile(_ < maxNum)
}