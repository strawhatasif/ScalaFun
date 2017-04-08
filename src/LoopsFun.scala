/**
 * Created by rab4154 on 12/30/2015.
 */
object LoopsFun
{
  def main (args: Array[String])
  {
    // ---------- LOOPING ----------
    // To compile and run in the terminal
    // 1. scalac ScalaTut.scala
    // 2. scala ScalaTut

    var i = 0

    while (i <= 10) {
      println(i)
      i += 1
    }

    do {
      println(i)
      i += 1
    }
    while (i <= 20)

    for (i <- 1 to 10) {
      println(i)
    }

    // until is often used to loop through strings or arrays
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length)
    {
      // Get the letter in the index of the String
      println(randLetters(i))
    }

    // Used to iterate through a list
    val aList = List(1, 2, 3, 4, 5)
    for (i <- aList)
    {
      println("List Item " + i)
    }
  }
}
