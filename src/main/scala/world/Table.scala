package world

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
class Table(val shape: Shape.Value) {

  def flip(angle: Int): Unit = println("Flip " + angle + " deg")
}

object Table {

  def apply(shape: Shape.Value): Table = {
    new Table(shape)
  }
}
