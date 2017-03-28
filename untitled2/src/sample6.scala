/**
  * Created by kiper on 21.03.17.
  */

class Person(firstName: String) {
  println("Outer constructor")
  def this(firstName: String, lastName: String) {
    this(firstName)
    println("Inner constructor")
  }
}

val bob = new Person("Bob")
val bobTate = new Person("Bob", "Tate")