package agoda

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
object Loop extends App {

  for (i <- 0 until 3) {
    println(s"until $i")
  }

  for (i <- 0 to 3) {
    println(s"to $i")
  }


}
