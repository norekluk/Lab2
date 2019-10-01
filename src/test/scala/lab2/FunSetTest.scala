package lab2

import org.scalatest.FunSuite

class FunSetTest extends FunSuite {

  import FunSet._

  test("singleton test") {
    val s = singleton(1)
    assert(s(1))
    assert(!s(0))
  }

  test("union") {
    val s = union(singleton(1), singleton(2))
    assert(s(1))
    assert(s(2))
  }

}
