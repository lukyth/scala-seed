package agoda

import scala.collection.mutable

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
object Stream extends App{

  import FizzBuzz._

  val list = List(19, 15, 13, 19, 11, 23, 11, 10, 12, 18, 16, 9, 10)

  def isBuzz(number: Int): Boolean = getFizzBuzz(number) == "Buzz"
  list filter isBuzz foreach println

  val result = mutable.ListBuffer[Int]()
  list.foreach(i => if(getFizzBuzz(i) == "Buzz") result.append(i))
  println(result.toSet)
}
