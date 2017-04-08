import FirstScalaClass.Superhero

/**
 * Created by rab4154 on 1/11/2016.
 */
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
