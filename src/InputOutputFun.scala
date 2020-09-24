import scala.io.StdIn.{readLine}

object InputOutputFun
{

 // ---------- INPUT / OUTPUT ----------
 def main (args: Array[String]): Unit =
 {
   var numberGuess = 0

   do{
     print("Guess a number : ")

     // You can also use readInt, readDouble, readByte, readShort, readLong,
     //
     numberGuess = readLine.toInt

   } while(numberGuess != 15)

   printf("You guessed the secret number %d\n", 15)

   // You can use string interpolation
   val name = "Derek"
   val age = 39
   val weight = 175.5
   println(s"Hello $name")

   println(f"I am ${age + 1} and weigh $weight%.2f")

   // printf Style Format Specifiers
   // %c : Characters
   // %d : Integers
   // %f : Floating Point Numbers
   // %s : Strings
   printf("'%5d'\n",5) // Right justify

   printf("'%-5d Hi'\n",5) // Left justify

   printf("'%05d'\n",5) // Zero Fill

   printf("'%.5f'\n",3.14) // 5 decimal minimum & maximum

   printf("'%-5s'\n", "Hi") // Left Justify String

   // Special Characters : \n, \b, \\, \a

   // ---------- STRINGS ----------
   var randSent = "I saw a dragon fly by"

   // Get the 3rd index value
   println("3rd Index : " + randSent(3))

   // Get String length
   println("String length " + randSent.length())

   // Concatenate strings
   println(randSent.concat(" and explode"))

   // Compare strings for equality
   println("Are strings equal " + "I saw a dragon".equals(randSent))

   // Get index of a match
   println("dragon starts at index ", randSent.indexOf("dragon"))

   // Convert a string into an array
   val randSentArray = randSent.toArray

   for (v <- randSentArray)
     println(v)
 }
}
