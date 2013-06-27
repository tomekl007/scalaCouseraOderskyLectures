package week3

object MainObj {
  
  def main(args: Array[String]) {
    
     val s = new NonEmpty(3,new Empty, new Empty)  //> s  : week3.class_hierarchy.NonEmpty = {.3.}
    val s2 = s include 4                          //> s2  : week3.class_hierarchy.IntSet = {.3{.4.}}
    
    val s3 = new NonEmpty(5,new Empty, new Empty) //> s3  : week3.class_hierarchy.NonEmpty = {.5.}
    
    val union = s2 union s3 
    println(union)
     
     def singleton[T](elem:T) = new Cons[T](elem,new  Nil)
     singleton[Int](1)//or T could be deducted from param like:
     singleton(2)
     
     /*
      val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
      val b: Array[IntSet] = a//Array are not covariant in scala!
      b(0) = Empty
      val s: NonEmpty = a(0)
     */
     

}

}