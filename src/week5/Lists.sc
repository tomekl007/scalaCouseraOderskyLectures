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
    
    
      def squareList(xs: List[Int]): List[Int] = xs match {
    		case Nil     => xs
    		case y :: ys => y*y :: squareList(ys)
  		}                                 //> squareList: (xs: List[Int])List[Int]
  		
  		val list = List(2,4,6)            //> list  : List[Int] = List(2, 4, 6)
			squareList(list)          //> res1: List[Int] = List(4, 16, 36)
		
  	
  	def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x*x)                             //> squareList2: (xs: List[Int])List[Int]
    	squareList2(list)                         //> res2: List[Int] = List(4, 16, 36)
    
    
    val frutis = List("apple","pinaplle","orange","banana")
                                                  //> frutis  : List[String] = List(apple, pinaplle, orange, banana)
    //list builded in operations
    nums2 filter(x=> x> 0)                        //> res3: List[Int] = List(2, 3, 1, 4)
    nums2 filterNot(x=> x > 0)                    //> res4: List[Int] = List(-2)
    nums2 partition(x=> x > 0)                    //> res5: (List[Int], List[Int]) = (List(2, 3, 1, 4),List(-2))
    
    nums2 takeWhile(x=> x > 0)                    //> res6: List[Int] = List(2)
    nums2 dropWhile(x=> x > 0)                    //> res7: List[Int] = List(-2, 3, 1, 4)
    nums2 span(x=> x > 0 )                        //> res8: (List[Int], List[Int]) = (List(2),List(-2, 3, 1, 4))
    
    
     
     
     def pack[T](xs: List[T]): List[List[T]] = xs match {
    	case Nil      => Nil
    	case x :: xs1 =>
				val(first,rest) = xs span (y=> y==x)
				first::pack(rest)
    	}                                         //> pack: [T](xs: List[T])List[List[T]]
    	val input = List("a", "a", "a", "b", "c", "c", "a")
                                                  //> input  : List[String] = List(a, a, a, b, c, c, a)
    	
    	pack(input)                               //> res9: List[List[String]] = List(List(a, a, a), List(b), List(c, c), List(a)
                                                  //| )
    	
    	input span(x=>x=="a")                     //> res10: (List[String], List[String]) = (List(a, a, a),List(b, c, c, a))
    	
    	
    	 def encode[T](xs: List[T]): List[(T, Int)] =
    	 pack(xs) map (ys=>(ys.head, ys.length))  //> encode: [T](xs: List[T])List[(T, Int)]
    	 
    	 encode(input)                            //> res11: List[(String, Int)] = List((a,3), (b,1), (c,2), (a,1))
    	
  
}