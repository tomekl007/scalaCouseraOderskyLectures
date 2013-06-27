package week2

object HigherOrderFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
  def cube(x:Int):Int = x*x*x;System.out.println("""cube: (x: Int)Int""");$skip(89); 
  
  def sumOfCubes(a:Int, b:Int):Int=
   if (a > b) 0 else cube(a) + sumOfCubes(a+1, b);System.out.println("""sumOfCubes: (a: Int, b: Int)Int""");$skip(23); val res$0 = 
   
   sumOfCubes(1,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(150); 
   
   
   //not tail recursive
   def sum(f:Int => Int, a:Int, b:Int):Int=//take Int => return Int
   if(a > b ) 0
   else
   		f(a) + sum(f, a+1,b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(42); 
   		
   
   def factorial(x:Int) = x * x;System.out.println("""factorial: (x: Int)Int""");$skip(55); 
   
  	def sumFact(a:Int, b:Int ) = sum(factorial,a,b);System.out.println("""sumFact: (a: Int, b: Int)Int""");$skip(20); val res$1 = 
  	
  	sumFact(1,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(39); val res$2 = 
  	//anonymus
  	(x:Int, y:Int) => x*y;System.out.println("""res2: (Int, Int) => Int = """ + $show(res$2));$skip(53); 
  	def sumCubes(a:Int, b:Int) = sum( x=>x*x*x ,a ,b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(201); 
   
   //sum tail recursive way
   def sumTail(f:Int => Int ,a:Int,b:Int):Int={
   		def loop(a:Int, acc:Int):Int={
   			if(a > b) acc
   			else loop(a+1,f(a) + acc)
   		}
   		loop(a,0)
   		
   };System.out.println("""sumTail: (f: Int => Int, a: Int, b: Int)Int""");$skip(71); 
   
   def sumFactTailRecursion(a:Int, b:Int) = sumTail(factorial,a,b);System.out.println("""sumFactTailRecursion: (a: Int, b: Int)Int""");$skip(30); val res$3 = 
   sumFactTailRecursion(1, 3);System.out.println("""res3: Int = """ + $show(res$3))}
  
  
  
}
