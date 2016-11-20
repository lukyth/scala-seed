package agoda

import world.{Person, Shape, Table}

/**
  * Created by pasoktummarungsri on 2016-11-10.
  */
object Main extends App {

  println("Initiate Class ")

  val t = new Table(Shape.Triangle)

  val t2 = Table.apply(Shape.Triangle)

  val t3 = Table(Shape Triangle)

  println(t3 shape)

  t3 flip 90

  println("=========== ")

  val p = Person("001", "Kanitkorn S.", 'M', 10)

  val p2: Person = new Person("002", "Cal", 'M', 10)

  println("Hello " + p)

  val shape = if(t.shape == Shape.Square) 4 else 3

  println(s"shape $shape")

  val shape2 = t.shape match {
    case Shape.Triangle => 3
    case Shape.Square => 4
    case Shape.Pentagon => 5
    case _ => new IllegalArgumentException
  }

  println(s"shape2 $shape2")

  def FizzBuzz(number: Int): String = {
    if(number % 15 == 0) return "FizzBuzz"
    if(number % 5 == 0) return "Buzz"
    if(number % 3 == 0) return "Fizz"
    s"$number"
  }

  println(FizzBuzz(2))
}
