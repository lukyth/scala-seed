package agoda

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
object ParStream extends App {

  import FizzBuzz._

  val list = List(19, 15, 13, 19, 11, 23, 11, 10, 12, 18, 16, 9, 10)

  list.foreach(i => println(getFizzBuzz(i)))

  println("==========")

  list.par.foreach(i => println(getFizzBuzz(i)))
}
