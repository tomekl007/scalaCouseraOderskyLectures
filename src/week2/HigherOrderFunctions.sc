package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def cube(x:Int):Int = x*x*x                     //> cube: (x: Int)Int
  
  def sumOfCubes(a:Int, b:Int):Int=
   if (a > b) 0 else cube(a) + sumOfCubes(a+1, b) //> sumOfCubes: (a: Int, b: Int)Int
   
   sumOfCubes(1,3)                                //> res0: Int = 36
   
   
   //not tail recursive
   def sum(f:Int => Int, a:Int, b:Int):Int=//take Int => return Int
   if(a > b ) 0
   else
   		f(a) + sum(f, a+1,b)              //> sum: (f: Int => Int, a: Int, b: Int)Int
   		
   
   def factorial(x:Int) = x * x                   //> factorial: (x: Int)Int
   
  	def sumFact(a:Int, b:Int ) = sum(factorial,a,b)
                                                  //> sumFact: (a: Int, b: Int)Int
  	
  	sumFact(1,3)                              //> res1: Int = 14
  	//anonymus
  	(x:Int, y:Int) => x*y                     //> res2: (Int, Int) => Int = <function2>
  	def sumCubes(a:Int, b:Int) = sum( x=>x*x*x ,a ,b)
                                                  //> sumCubes: (a: Int, b: Int)Int
   
   //sum tail recursive way
   def sumTail(f:Int => Int ,a:Int,b:Int):Int={
   		def loop(a:Int, acc:Int):Int={
   			if(a > b) acc
   			else loop(a+1,f(a) + acc)
   		}
   		loop(a,0)
   		
   }                                              //> sumTail: (f: Int => Int, a: Int, b: Int)Int
   
   def sumFactTailRecursion(a:Int, b:Int) = sumTail(factorial,a,b)
                                                  //> sumFactTailRecursion: (a: Int, b: Int)Int
   sumFactTailRecursion(1, 3)                     //> res3: Int = 14
  
  
  
}