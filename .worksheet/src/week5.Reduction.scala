package week5

object Reduction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
  println("Welcome to the Scala worksheet");$skip(78); 
  
  def product(xs:List[Int]) = (1::xs) reduceLeft ((x,y) => x*y);System.out.println("""product: (xs: List[Int])Int""");$skip(27);  //or (_*_)
  val list = List(1,2,3,4);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(16); val res$0 = 
  product(list);System.out.println("""res0: Int = """ + $show(res$0));$skip(25); 
  val emptyList = List();System.out.println("""emptyList  : List[Nothing] = """ + $show(emptyList ));$skip(21); val res$1 = 
  product(emptyList);System.out.println("""res1: Int = """ + $show(res$1));$skip(64); 
    
    def product2(xs:List[Int]):Int = (xs foldLeft 1) (_*_);System.out.println("""product2: (xs: List[Int])Int""");$skip(19); val res$2 = 
    product2(list);System.out.println("""res2: Int = """ + $show(res$2));$skip(86); 
  	
  	   def lengthFun(xs: List[Int]): Int =
    (xs foldRight 0) ( (x,y) => 1 + y );System.out.println("""lengthFun: (xs: List[Int])Int""");$skip(100); 
  
  
  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())( f(_)::_ );System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(52); val res$3 = 
    
    mapFun[Int,String](list, x => x + "some" );System.out.println("""res3: List[String] = """ + $show(res$3));$skip(20); val res$4 = 
    lengthFun(list);System.out.println("""res4: Int = """ + $show(res$4));$skip(46); 
    
    val lengthList = List(1,2,3,4,5,6,7);System.out.println("""lengthList  : List[Int] = """ + $show(lengthList ));$skip(24); val res$5 = 
		lengthFun(lengthList);System.out.println("""res5: Int = """ + $show(res$5));$skip(32); 
		val lengthList2  = List(1,99);System.out.println("""lengthList2  : List[Int] = """ + $show(lengthList2 ));$skip(25); val res$6 = 
		lengthFun(lengthList2);System.out.println("""res6: Int = """ + $show(res$6))}
		
  
  
}
