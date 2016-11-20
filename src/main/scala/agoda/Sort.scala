package agoda

import world.Person

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
object Sort extends App {

  val list = List(19, 15, 13, 19, 11, 23, 11, 10, 12, 18, 16, 9, 10)

  val sorted = list.sortWith(_ > _)

  val sorted2 = list.sortWith((x, y) => x < y)

  println(sorted)

  println(sorted2)

  val personList = list.map(age => Person("001", "Kanitkorn S.", 'M', age))

  val personListSorted = personList.sortWith(_.age > _.age).map(_.age)

  println(personListSorted)

  personList foreach println

  personList find(p => p.id == "5")

  println(personList.par.foldLeft(0)((n, p) => n + p.age))
}
