package week5

import math.Ordering

object MainObject {
  
  def main(args: Array[String]) {
    
     
    val nums2:List[Int]= List(2,-2,3,1,4)                   //> nums2  : List[Int] = List(2, -2, 3, 1, 4)
    val sorted = mSort(nums2)(Ordering.Int)
    println(sorted)
    val frutis = List("apple","pinaplle","orange","banana")
    val sortedFutis = mSort(frutis)
    println(sortedFutis)
    
    
  }
  
   def mSort[T](xs:List[T])(implicit ord:Ordering[T]):List[T] = {
  val n = xs.length/2
  if (n==0) xs
  	else{
  	  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case(Nil, ys ) => ys
      case(xs, Nil) => xs
      case(x::xs1, y::ys1) =>
      	if(ord.lt(x,y)) x::merge(xs1,ys)
      	else y::merge(xs,ys1)
      
    }
  	  
  		val(first,second)=xs splitAt n
  		merge(mSort(first),mSort(second) )

		}
  
  
  }   
   
     /* def lengthFun[Int](xs: List[Int]): Int =
    (xs foldRight 0) (  _ + _ )*/
  
  
	   

}