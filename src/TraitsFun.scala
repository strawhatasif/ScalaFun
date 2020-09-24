import FirstScalaClass.Superhero

object TraitsFun
{
  def main(args: Array[String]): Unit =
  {
    // ---------- TRAITS ----------
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))
  }
}
