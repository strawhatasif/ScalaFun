/**
 * Created by rab4154 on 12/28/2015.
 */
/*
You can execute commands directly in the terminal
REPL : Read Evaluate Print Loop
Type scala in terminal to start and :q to quit

// Creates a variable of the correct type
10 + 3 * 5 / 2

// You only use semicolons in Scala if you have multiple statements per line

// You can use that variable in the code that follows
"Your answer " + res0

// Define your own variable
var myName = "Derek"

// Define your own constant variable
val myAge = 40

// You can define the type
val lastName: String = "Banas"

// ---------- DATA TYPES ----------

// All datatypes in Scala are objects and they include
// (Get the max value with MaxValue)
// Byte : -128 to 127
// Boolean : true or false
// Char : unsigned max value 65535
// Short : -32768 to 32767
// Int : -2147483648 to 2147483647
// Long : -9223372036854775808 to 9223372036854775807
// Float : -3.4028235E38 to 3.4028235E38
// Double : -1.7976931348623157E308 to 1.7976931348623157E308

// A Double will only hold precision up to 15 digits
val num13 = 1.999999999999999

// Create a BigInt
val lgPrime = BigInt("622288097498926496141095869268883999563096063592498055290461")
lgPrime + 1

Create a BigDecimal
val pi50 = BigDecimal("3.14159265358979323846264338327950288419716939937510")
0.00000000000000000000000000000000000000000000000001 + pi50

var randInt = 100000

// See functions available by typing randInt. (Click Tab)
// randInt.asInstanceOf[Double] casts number to a double
// randInt.isInstanceOf[Int] checks if is of type Int

// ---------- MATH ----------
"5 + 4 = " + (5 + 4)
"5 - 4 = " + (5 - 4)
"5 * 4 = " + (5 * 4)
"5 / 4 = " + (5 / 4)
"5 % 4 = " + (5 % 4)

// Shorthand notation (No randInt++, or randInt--)
randInt += 1
"randInt += 1" + randInt

randInt -= 1
"randInt -= 1" + randInt

randInt *= 1
"randInt *= 1" + randInt

randInt /= 1
"randInt /= 1" + randInt

// Import the math library in the terminal import scala.math._

abs(-8)
cbrt(64) // Cube root a^3 = n (Find a)
ceil(5.45)
round(5.45)
floor(5.45)
exp(1) // Euler's number raised to the power
pow(2, 2) // 2^2
sqrt(pow(2,2) + pow(2,2))
hypot(2, 2) // sqrt(X^2 + y^2)
log10(1000) // = 3 (10?×?10?×?10 = 10^3)
log(2.7182818284590455) // Natural logarithm to the base e
min(5, 10)
max(5, 10)
(random * (11 - 1) + 1).toInt // Random number between 1 and 10
toRadians(90)
toDegrees(1.5707963267948966)

// acos, asin, atan, atan2, cos, cosh, sin, sinh, tan, tanh

// ---------- CONDITIONALS ----------
// if statements are like Java except they return a value like the
// ternary operator

// Conditional Operators : ==, !=, >, <, >=, <=
// Logical Operators : &&, ||, !

var age = 18

val canVote = if (age >= 18) "yes" else "no"

// You have to use { } in the REPL, but not otherwise
if ((age >= 5) && (age <= 6)) {
  println("Go to Kindergarten")
} else if ((age > 6) && (age <= 7)) {
  println("Go to Grade 1")
} else {
  println("Go to Grade " + (age - 5))
}

true || false
!(true)

*/


// Scala is the perfect choice if you want to explore functional
// programming without disregarding OOP
// Scala runs on the JVM which provides a ton of libraries

// File ends with the scala extension

// How to import library functions

import scala.io.StdIn.{readLine}
import scala.math._
import java.io.PrintWriter
import scala.io.Source

object FirstScalaClass
{

  // ---------- START OF MAIN ----------
  def main (args: Array[String]): Unit =
  {
    val name ="Jessica"
    val age = 22
    val weight = 110.0

    println(s"Hello $name")
    println(f"I am $age and weigh $weight%.2f pounds")

    printf(" '%05d'\n", 5)
    printf(" '%-5d'", 5)

  }
  // ---------- END OF MAIN ----------


  // ---------- CLASSES ----------
  // Classes are used as blueprints to create objects
  // Objects define the attributes (fields) and capabilities (methods) of an
  // object

  class Animal(var name : String, var sound : String) {
    this.setName(name)

    // Any code that follows the class name is executed each time an
    // object is created as part of the Primary Constructor

    // This function is defined in the Animal companion object below
    val id = Animal.newIdNum

    // You must initialize all fields
    // protected means the field can only be accessed directly by methods
    // defined in the class or by subclasses
    // private fields can't be accessed by subclasses of Animal
    // public fields can be accessed directly by anything

    // protected var name = "No Name"
    // protected var sound = "No Sound"

    // Getters and setters are used to protect data
    def getName() : String = name
    def getSound() : String = sound
    def setName(name : String){
      // Check if the String contains numbers and if so don't allow
      if(!(name.matches(".*\\d+.*")))

      // this allows us to refer to any object without knowing its name
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound : String) {
      this.sound = sound
    }

    // Subclasses can't call this constructor unlike with Java
    def this (name : String){

      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
      this.setName(name)
    }

    def this (){
      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
    }

    // You can override any other method
    override def toString() : String = {

      // How to format Strings
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  // The companion object for a class is where you'd define static class
  // variables and functions in Java
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber }
  }

  // ---------- INHERITANCE ----------
  // A class that inherits from another gains all its fields and methods
  // A class declared final can't be extended
  class Dog (name : String, sound : String, growl : String) extends
  Animal(name, sound){

    def this (name : String, sound : String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this (name : String){
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this (){
      this("No Name", "No Sound", "No Growl")
    }

    // You can override any other method
    override def toString() : String = {
      return "%s with the id %d says %s or %s".format(
        this.name, this.id, this.sound, this.growl)
    }
  }

  // ---------- ABSTRACT CLASS ----------
  // An abstract class can't be instantiated. It is made up of both abstract
  // and non-abstract methods and fields

  abstract class Mammal(val name : String){
    // An abstract field has no initial value
    var moveSpeed : Double

    // An abstract method has no body
    def move : String

  }

  class Wolf(name : String) extends Mammal(name){
    // You don't use override when defining abstract fields
    var moveSpeed = 35.0;

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

  }

  // ---------- TRAITS ----------
  // A trait is a like a Java interface in that a class can extend more then 1
  // Unlike Java interfaces traits can provide concrete methods and fields
  trait Flyable {
    def fly : String

  }

  trait Bulletproof {
    def hitByBullet : String

    // You can define concrete methods in traits
    def ricochet(startSpeed : Double) : String = {
      "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  // The first trait starts with extends and then with for each other
  class Superhero(val name : String) extends Flyable with Bulletproof{
    def fly = "%s flys through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }

} // ---------- End of object ScalaTut ----------

