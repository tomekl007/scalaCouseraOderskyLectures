package week5

object Lists {
  
  val nums = List(1,2,3,4,5)                      //> nums  : List[Int] = List(1, 2, 3, 4, 5)
  println(removeAt(1,nums))                       //> List(1, 3, 4, 5)
  
  
  def removeAt(n:Int, list:List[Int]):List[Int] = (list take n) ::: (list drop n+1)
                                                  //> removeAt: (n: Int, list: List[Int])List[Int]
                                                  
  val pair = ("answer", 42)                       //> pair  : (String, Int) = (answer,42)
 
  val(label,value) = pair                         //> label  : String = answer
                                                  //| value  : Int = 42
  
  
  def mSort(xs:List[Int]):List[Int] = {
  val n = xs.length/2
  if (n==0) xs
  	else{
  		val(first,second)=xs splitAt n
  		merge(mSort(first),mSort(second) )

		}
  
  }                                               //> mSort: (xs: List[Int])List[Int]
  
  
	def merge(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case(Nil, ys ) => ys
      case(xs, Nil) => xs
      case(x::xs1, y::ys1) =>
      	if(x < y) x::merge(xs1,ys)
      	else y::merge(xs,ys1)
      
    }                                             //> merge: (xs: List[Int], ys: List[Int])List[Int]
    
    val nums2= List(2,-2,3,1,4)                   //> nums2  : List[Int] = List(2, -2, 3, 1, 4)
    mSort(nums2)                                  //> res0: List[Int] = List(-2, 1, 2, 3, 4)
}