package lab2

import org.scalatest.FunSuite

class FunSetTest extends FunSuite {

  import FunSet._

  test("singleton test") {
    val s = singleton(1)
    assert(s(1))
    assert(!s(0))
    print(s)
  }

  test("union") {
    val s = union(singleton(1), singleton(2))
    assert(s(1))
    assert(s(2))
    print(s)
  }

  test("filter positive") {
    val s = filter(union(singleton(1), singleton(2)), in => in > 0)
    assert(s(1))
    assert(s(2))
    print(s)
  }

  test("filter negative") {
    val s = filter(union(singleton(1), singleton(2)), in => in < 0)
    assert(!s(1))
    assert(!s(2))
    print(s)
  }

  test("filter positive and divisible by 3") {
    val s = filter(union(singleton(3), singleton(2)), in => (in > 0 && in%3 ==0))
    assert(!s(1))
    assert(!s(2))
    assert(s(3))
    print(s)
  }

}
