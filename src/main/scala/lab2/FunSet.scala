package lab2

object FunSet {
  type Set = Int => Boolean

  def contains(s: Set, e: Int): Boolean = ???

  def singleton(e: Int): Set = ???

  def union(s1: Set, s2: Set): Set = ???

  def intersect(s1: Set, s2: Set): Set = ???

  def diff(s1: Set, s2: Set): Set = ???

  def filter(s: Set, p: Int => Boolean): Set = ???

  def toString(s: Set, from: Int = -1000, to: Int = 1000): String =
    from.to(to)
      .filter(x => contains(s, x))
      .mkString("{", ",", "}")

  def print(s: Set): Unit = println(toString(s))
}
