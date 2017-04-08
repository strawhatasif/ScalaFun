import scala.math.BigInt

/**
 * Created by rab4154 on 1/11/2016.
 */
object FunFunFunctions
{
    def main(args: Array[String]): Unit =
    {
      // ---------- FUNCTIONS ----------
      // def funcName (param1:dataType, param2:dataType) : returnType = {
      //    function body
      //    return valueToReturn
      // }

      // You can give parameters default values
      def getSum( num1:Int = 1, num2:Int = 1) : Int = {
        return num1 + num2
      }

      println("5 + 4 = " + getSum(5,4))

      // you can use named arguments
      println("5 + 4 = " + getSum(num2=5, num1=4))

      // A function that returns nothing (Procedure)
      def sayHi() : Unit = {
        println("Hi how are you doing")
      }

      sayHi

      // Receive variable number of arguments
      def getSum2(args: Int*) : Int = {
        var sum : Int = 0
        for(num <- args){
          sum += num
        }
        sum
      }

      println("getSum2: " + getSum2(1,2,3,4,5))

      // Recursion example calculating factorials
      def factorial(num : BigInt) : BigInt = {
        if (num <= 1)
          1
        else
          num * factorial(num - 1)
      }

      // 1st: num = 4 * factorial(3) = 4 * 6 = 24
      // 2nd: num = 3 * factorial(2) = 3 * 2 = 6
      // 3rd: num = 2 * factorial(1) = 2 * 1 = 2

      println("Factorial of 4 = " + factorial(4))

    }
}
