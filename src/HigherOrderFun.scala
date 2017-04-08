import java.io.PrintWriter

import scala.io.Source
import scala.math._

/**
 * Created by rab4154 on 1/11/2016.
 */
object HigherOrderFun
{

  def main(args: Array[String]): Unit =
  {

    // ---------- HIGHER ORDER FUNCTIONS ----------
    // Functions can be passed like any other variable
    // You need the _ after the function to state you meant the function
    val log10Func = log10 _

    println(log10Func(1000))

    // You can apply a function to all items of a list with map
    List(1000.0,10000.0).map(log10Func).foreach(println)

    // You can use an anonymous function with map as well
    // Receives an Int x and multiplies every x by 50
    List(1,2,3,4,5).map((x : Int) => x * 50).foreach(println)

    // Filter will pass only those values that meet a condition
    List(1,2,3,4,5,6).filter(_ % 2 == 0).foreach(println)

    // Pass different functions to a function
    def times3(num : Int) = num * 3
    def times4(num : Int) = num * 4

    // Define the function parameter type and return type
    def multIt(func : (Int) => Double, num : Int ) = {
      func(num)
    }

    printf("3 * 100 = %.1f)\n", multIt(times3, 100))

    // A closure is a function that depends on a variable declared outside
    // of the function
    val divisorVal = 5
    val divisor5 = (num : Double) => num / divisorVal
    println("5 / 5 = " + divisor5(5.0))

    // ---------- FILE I/O ----------
    // Use import java.io.PrintWriter to write to a file
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nSome more random text")
    writer.close()

    // Use import scala.io.Source to read from files
    val textFromFile = Source.fromFile("test.txt", "UTF-8")

    // Iterate through each line in the file and print
    val lineIterator = textFromFile.getLines
    for(line <- lineIterator){
      println(line)
    }
    textFromFile.close()

  }
}
