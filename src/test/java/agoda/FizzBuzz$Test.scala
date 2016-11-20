package agoda

import org.scalatest.FunSuite

/**
  * Created by Lukyth on 11/20/2016 AD.
  */
class FizzBuzz$Test extends FunSuite {

  test("testGetFizzBuzz") {
    assert(FizzBuzz.getFizzBuzz(5) == "Buzz")
  }
}
