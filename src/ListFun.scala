object ListFun {
   def main (args: Array[String])
   {
     // Store even numbers in a list
     var evenList = for { i <- 1 to 20
                          // You can put as many conditons here separated with semicolons
                          // as you need
                          if (i % 2) == 0
     } yield i

     println("Even List")
     //Brackets are optional in Scala - you can add them if you're comfortable with them
     // (maybe because you program in Java...)
     for(i <- evenList)
       println(i)

     // This loop assigns a value to the 1st variable and it retains
     // that value until the 2nd finishes its cycle and then it iterates
     for (i <- 1 to 5; j <- 6 to 10){
       println("i: " + i)
       println("j: " + j)
     }
   }
 }
