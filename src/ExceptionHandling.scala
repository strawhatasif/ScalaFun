/**
 * Created by rab4154 on 1/11/2016.
 */
object ExceptionHandling
{

  def main(args: Array[String]): Unit =
  {

    println("3 / 0 = " + divideNums(3,0))

  }

  // ---------- EXCEPTION HANDLING ----------

  def divideNums(num1 : Int, num2 : Int) = try
  {
    (num1 / num2)
  } catch {
    case ex: java.lang.ArithmeticException => "Can't divide by zero"
  } finally {
    // Clean up after exception here
  }

}
