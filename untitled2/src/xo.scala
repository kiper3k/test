/**
  * Created by kiper on 21.03.17.
  */

//import scala.util.control.Breaks

class XO {

  val table = Array(Array("", "", ""), Array("", "", ""), Array("", "", ""))
  //  val table = Array(Array("x", "o", "x"), Array("o", "x", "x"), Array("o", "x", "o"))
  val table = Array("","","","","","","","","")


  def printTable() {
    println("----------------")
    for (i <- 0 until table.length) {
      print("|  ")
      for (j <- 0 until table(i).length) {
        print(table(i)(j))
        print(" | ")
      }
      println()
    }
    println("----------------")
  }

  def gameOver(): Boolean = {
    if (table(0)(0) == "x" && table(1)(1) == "x" && table(2)(2) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0)(2) == "x" && table(1)(1) == "x" && table(2)(0) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0)(0) == "x" && table(0)(1) == "x" && table(0)(2) == "x") {
      println("GAME OVER")
      return true
    } else if (table(1)(0) == "x" && table(1)(1) == "x" && table(1)(2) == "x") {
      println("GAME OVER")
      return true
    } else if (table(2)(0) == "x" && table(2)(1) == "x" && table(2)(2) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0)(0) == "x" && table(1)(0) == "x" && table(2)(0) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0)(1) == "x" && table(1)(1) == "x" && table(2)(1) == "x") {
      println("GAME OVER")
      return true
    } else if (table(0)(2) == "x" && table(1)(2) == "x" && table(2)(2) == "x") {
      println("GAME OVER")
      return true
    }

    if (table(0)(0) == "o" && table(1)(1) == "o" && table(2)(2) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0)(2) == "o" && table(1)(1) == "o" && table(2)(0) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0)(0) == "o" && table(0)(1) == "o" && table(0)(2) == "o") {
      println("GAME OVER")
      return true
    } else if (table(1)(0) == "o" && table(1)(1) == "o" && table(1)(2) == "o") {
      println("GAME OVER")
      return true
    } else if (table(2)(0) == "o" && table(2)(1) == "o" && table(2)(2) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0)(0) == "o" && table(1)(0) == "o" && table(2)(0) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0)(1) == "o" && table(1)(1) == "o" && table(2)(1) == "o") {
      println("GAME OVER")
      return true
    } else if (table(0)(2) == "o" && table(1)(2) == "o" && table(2)(2) == "o") {
      println("GAME OVER")
      return true
    }

    return false
  }

  def move(s:String): Unit ={
    print("?: ")
    var i = scala.io.StdIn.readLine()
    print("?: ")
    var j = scala.io.StdIn.readLine()

    table(i.toInt)(j.toInt) = s
    printTable()
  }

  def play() {
    //    val break = new Breaks

    while (true) {

      move("x")
      if (gameOver()) {
        return
      }

      move("o")
      if (gameOver()) {
        return
      }
    }

  }
}

val game = new XO
game.play()
