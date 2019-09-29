package lab2

import org.scalatest.FunSuite

class ObjSetTest extends FunSuite {

  test("Including and contains") {
    val s = ObjSet(1).including(2).including(3)
    assert(s contains 1)
    assert(s contains 2)
    assert(s contains 3)
  }

  test("Excluding") {
    val s = ObjSet(1).including(2).including(3)
    assert(!(s.excluding(1) contains 1))
    assert(!(s.excluding(2) contains 2))
    assert(!(s.excluding(3) contains 3))
  }

}
