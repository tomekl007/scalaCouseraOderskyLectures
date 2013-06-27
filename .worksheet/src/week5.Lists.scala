package week5

object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  
  val nums = List(1,2,3,4,5);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(28); 
  println(removeAt(1,nums));$skip(90); 
  
  
  def removeAt(n:Int, list:List[Int]):List[Int] = (list take n) ::: (list drop n+1);System.out.println("""removeAt: (n: Int, list: List[Int])List[Int]""");$skip(80); 
                                                  
  val pair = ("answer", 42);System.out.println("""pair  : (String, Int) = """ + $show(pair ));$skip(28); 
 
  val(label,value) = pair;System.out.println("""label  : String = """ + $show(label ));System.out.println("""value  : Int = """ + $show(value ));$skip(178); 
  
  
  def mSort(xs:List[Int]):List[Int] = {
  val n = xs.length/2
  if (n==0) xs
  	else{
  		val(first,second)=xs splitAt n
  		merge(mSort(first),mSort(second) )

		}
  
  };System.out.println("""mSort: (xs: List[Int])List[Int]""");$skip(240); 
  
  
	def merge(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case(Nil, ys ) => ys
      case(xs, Nil) => xs
      case(x::xs1, y::ys1) =>
      	if(x < y) x::merge(xs1,ys)
      	else y::merge(xs,ys1)
      
    };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(37); 
    
    val nums2= List(2,-2,3,1,4);System.out.println("""nums2  : List[Int] = """ + $show(nums2 ));$skip(17); val res$0 = 
    mSort(nums2);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(145); 
    
    
      def squareList(xs: List[Int]): List[Int] = xs match {
    		case Nil     => xs
    		case y :: ys => y*y :: squareList(ys)
  		};System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(32); 
  		
  		val list = List(2,4,6);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(20); val res$1 = 
			squareList(list);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(76); 
		
  	
  	def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x*x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(23); val res$2 = 
    	squareList2(list);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(70); 
    
    
    val frutis = List("apple","pinaplle","orange","banana");System.out.println("""frutis  : List[String] = """ + $show(frutis ));$skip(60); val res$3 = 
    //list builded in operations
    nums2 filter(x=> x> 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(31); val res$4 = 
    nums2 filterNot(x=> x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(31); val res$5 = 
    nums2 partition(x=> x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(37); val res$6 = 
    
    nums2 takeWhile(x=> x > 0);System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(31); val res$7 = 
    nums2 dropWhile(x=> x > 0);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(27); val res$8 = 
    nums2 span(x=> x > 0 );System.out.println("""res8: (List[Int], List[Int]) = """ + $show(res$8));$skip(198); 
    
    
     
     
     def pack[T](xs: List[T]): List[List[T]] = xs match {
    	case Nil      => Nil
    	case x :: xs1 =>
				val(first,rest) = xs span (y=> y==x)
				first::pack(rest)
    	};System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(57); 
    	val input = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""input  : List[String] = """ + $show(input ));$skip(23); val res$9 = 
    	
    	pack(input);System.out.println("""res9: List[List[String]] = """ + $show(res$9));$skip(33); val res$10 = 
    	
    	input span(x=>x=="a");System.out.println("""res10: (List[String], List[String]) = """ + $show(res$10));$skip(109); 
    	
    	
    	 def encode[T](xs: List[T]): List[(T, Int)] =
    	 pack(xs) map (ys=>(ys.head, ys.length));System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(27); val res$11 = 
    	 
    	 encode(input);System.out.println("""res11: List[(String, Int)] = """ + $show(res$11))}
    	
  
}
