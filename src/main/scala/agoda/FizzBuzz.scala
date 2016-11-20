package agoda

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
object FizzBuzz extends App {
  def getFizzBuzz(number: Int): String = {
    (number % 3, number % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case (_, _) => s"$number"
    }
  }

  def run(number: Int): Unit = {
    println(getFizzBuzz(number))
  }
}
