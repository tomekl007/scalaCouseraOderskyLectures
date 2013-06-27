package week3

import java.util.NoSuchElementException

trait List[+T] {
	def isEmpty:Boolean
	def head:T
	def tail:List[T]//gives remaining list
	
	//def prepend(elem: T): List[T] = new Cons(elem, this)//new Cons(Empty,this) - it violates liskov subst. princ.
	def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
	
	
}

class Cons[T](val head:T, val tail:List[T]) extends List[T]{
  
  def isEmpty = false
 
}

class Nil extends List[Nothing]{
  def isEmpty:Boolean = true
  def head:Nothing = throw new NoSuchElementException("Nil.head")
  def tail:Nothing = throw new NoSuchElementException("Nil.tail") //Nothing is a subtype
  																  //of any other type including T
  
}
object test {
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
  
   def main(args: Array[String]) {
    
	   val x:List[String] = new Nil
	   
	   val list = new Cons(new NonEmpty(1,new Empty, new Empty),new Nil)
	   val value = new Empty
	   
	   println(f(list,value))
	   
  
   }
}


/*
object List {
  //List(1,2) = List.apply(1,2)
  def apply[T](x:T, y:T) : List[T] = new Cons(x, new Cons(y, new Nil))
}*/

