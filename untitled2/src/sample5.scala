/**
  * Created by kiper on 21.03.17.
  */

class Compass {
  //konstruktor
  val directions = List("north","east","west","south")
  var bearing = 0
  print("Initial bearing: ")
  println(directions)

  def direction() = directions(bearing)

  def inform(turnDirection: String) {
    println("Turning " + turnDirection + ". Now bearing " + direction)
  }

  def turnRight() {
    bearing = (bearing + 1) % directions.size
    inform("rignt")
  }

  def turnLeft() {
    bearing = (bearing + (directions.size -1)) % directions.size
    inform("left")
  }
}

val myCompass = new Compass

myCompass.turnRight
myCompass.turnLeft