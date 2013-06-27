package week5

object Reduction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def product(xs:List[Int]) = (1::xs) reduceLeft ((x,y) => x*y) //or (_*_)
                                                  //> product: (xs: List[Int])Int
  val list = List(1,2,3,4)                        //> list  : List[Int] = List(1, 2, 3, 4)
  product(list)                                   //> res0: Int = 24
  val emptyList = List()                          //> emptyList  : List[Nothing] = List()
  product(emptyList)                              //> res1: Int = 1
    
    def product2(xs:List[Int]):Int = (xs foldLeft 1) (_*_)
                                                  //> product2: (xs: List[Int])Int
    product2(list)                                //> res2: Int = 24
  	
  	   def lengthFun(xs: List[Int]): Int =
    (xs foldRight 0) ( (x,y) => 1 + y )           //> lengthFun: (xs: List[Int])Int
  
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( f(_)::_ )           //> mapFun: [T, U](xs: List[T], f: T => U)List[U]
    
    mapFun[Int,String](list, x => x + "some" )    //> res3: List[String] = List(1some, 2some, 3some, 4some)
    lengthFun(list)                               //> res4: Int = 4
    
    val lengthList = List(1,2,3,4,5,6,7)          //> lengthList  : List[Int] = List(1, 2, 3, 4, 5, 6, 7)
		lengthFun(lengthList)             //> res5: Int = 7
		val lengthList2  = List(1,99)     //> lengthList2  : List[Int] = List(1, 99)
		lengthFun(lengthList2)            //> res6: Int = 2
		
  
  
}