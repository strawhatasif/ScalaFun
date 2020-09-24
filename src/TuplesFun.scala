import FirstScalaClass.{Wolf, Dog, Animal}

object TuplesFun
{

    def main(args: Array[String]): Unit =
    {
      // ---------- TUPLES ----------
      // Tuples can hold values of many types, but they are immutable

      var tupleMarge = (103, "Marge Simpson", 10.25)

      printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

      // Iterate through a tuple
      tupleMarge.productIterator.foreach{ i => println(i)}

      // Convert Tuple to String
      println(tupleMarge.toString())

      // ---------- CLASSES ----------
      val rover = new Animal()
      rover.setName("Rover")
      rover.setSound("Woof")
      printf("%s says %s\n", rover.getName, rover.getSound)

      val whiskers = new Animal("Whiskers", "Meow")
      println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

      println(whiskers.toString)

      val spike = new Dog("Spike", "Woof", "Grrrr")

      spike.setName("Spike")
      println(spike.toString)

      val fang = new Wolf("Fang")
      fang.moveSpeed = 36.0
      println(fang.move)
    }
}


