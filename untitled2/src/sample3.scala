/**
  * Created by kiper on 21.03.17.
  */

object Test {
  def main(args: Array[String]): Unit = {
    var a = 1;
    var i = 0;

    println("while loop using Java-style iteration")
    while (a < 10) {
      println("Value of a: " + a);
      a = a + 1
    }

    println("for loop using R-style iteration")
    for (i <- 0 until args.length) {
      println(args(i))
    }

    println("for loop using Ruby-style iteration")
    args.foreach { arg =>
      println(arg)
    }
  }
}

Test.main(Array("a","b","c"))

