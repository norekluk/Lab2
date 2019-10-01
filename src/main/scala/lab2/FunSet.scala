package lab2

object FunSet {
  type Set = Int => Boolean

  def contains(s: Set, e: Int): Boolean = {
    s(e)
  }

  def singleton(e: Int): Set = in => e == in

  def union(s1: Set, s2: Set): Set = in => s1(in) || s2(in)

  def intersect(s1: Set, s2: Set): Set = in => s1(in) && s2(in)

  def diff(s1: Set, s2: Set): Set = in => s1(in) && !s2(in)

  def filter(s: Set, p: Int => Boolean): Set = in => s(in) && p(in)

  def toString(s: Set, from: Int = -1000, to: Int = 1000): String =
    from.to(to)
      .filter(x => contains(s, x))
      .mkString("{", ",", "}")

  def print(s: Set): Unit = println(toString(s))
}
