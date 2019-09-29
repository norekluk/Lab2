package lab2

abstract class ObjSet {
  def contains(e: Int): Boolean
  def including(e: Int): ObjSet
  def excluding(e: Int): ObjSet
  def union(s: ObjSet): ObjSet
  def intersection(s: ObjSet): ObjSet
  def diff(s: ObjSet): ObjSet
  def filter(p: Int => Boolean): ObjSet
  def map(f: Int => Int): ObjSet
  def forall(p: Int => Boolean): Boolean
  def foreach(f: Int => Unit): Unit
}

object ObjSet {
  def apply(x: Int): ObjSet = ???
}