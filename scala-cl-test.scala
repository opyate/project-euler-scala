import scalacl._
import scala.math._

object Test {
  def main(args: Array[String]): Unit = {
    implicit val context = Context.best // prefer CPUs ? use Context.best(CPU)
    val rng = (100 until 100000).cl // transform the Range into a CLIntRange
    // ops done asynchronously on the GPU (except synchronous sum) :
    val sum = rng.map(_ * 2).zipWithIndex.map(p => p._1 * p._2).sum
    println("sum = " + sum)
  }
}

