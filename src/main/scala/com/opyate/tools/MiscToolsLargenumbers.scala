package com.opyate.tools

/**
 * TODO Javadoc here...
 *
 * @author Juan Uys
 */

object MiscToolsLargenumbers {

  lazy val bigNaturals: Stream[BigInt] = Stream.cons(BigInt(1), bigNaturals.map(i => i + BigInt(1)))

  // lazy val naturalNums: Stream[Int] = Stream.cons(1, naturalNums.map(_ + 1))
  // def ints(n: Int): Stream[Int] = Stream.cons(n, ints(n+1))
  def nBigNaturals(n: BigInt): Stream[BigInt] = Stream.cons(n, nBigNaturals(n + BigInt(1)))

  // how many factors? (when we don't need the actual factors)
  def nfactorsLarge(number: BigInt): BigInt = {
    var x = BigInt(1)
    Range.BigInt(BigInt(1), number, BigInt(1)).map(i => {
      if (number % i == BigInt(0))
        x = x + BigInt(1)
      else {}
    })
    x
  }

  def nfactorsLargeWithLimit(number: BigInt): BigInt = {
    var limit = number
    var x = BigInt(0)
    for(i <- BigInt(1) to number if i < limit) {
      if (number % i == BigInt(0)) {
        limit = number / i
        if (limit != i) {
          x = x + BigInt(1)
        }
        x = x + BigInt(1)
      } else {}
    }
    x
  }

  def nFactorsQuick(n: BigInt): Int = {
    import Prime._
    prime_factors(n).groupBy(i => i).values.map(l => l.size + 1).product
  }
  
}