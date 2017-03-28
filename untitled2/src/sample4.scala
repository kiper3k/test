/**
  * Created by kiper on 21.03.17.
  */

def rangeExample {
  val range = 0 until 10

  println("range example")
  println(range.start+" "+range.end)

  for (i <- range) {
    println(i)
  }

  val secondRange = 0 until 10 by 5
  println(secondRange.start+" "+secondRange.end+" "+secondRange.step)
  for (i <- secondRange) {
    println(i)
  }

  val thirdRange = (10 to 0) by -1

  val fourthRange = (0 to 10)

  val fifthRange = 'a' to 'd'

  val course = ("Skrypty","E-biznes")

  println(course._1)

  val (x,y)=(1,2)
  println(x)

}

rangeExample