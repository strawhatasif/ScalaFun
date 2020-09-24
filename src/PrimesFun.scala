object PrimesFun
{

  // ---------- START OF MAIN ----------
  def main (args: Array[String]): Unit =
  {

    val primeList = List(1,2,3,5,7,11)
    for (i <- primeList){

      // Works like break if you return from a function
      if(i == 11){
        return
      }

      // Works like continue
      if (i != 1){
        println(i)
      }

    }

  }
  // ---------- END OF MAIN ----------

}
