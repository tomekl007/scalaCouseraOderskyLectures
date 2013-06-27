package week2

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(173); 
  
  def sum(f:Int => Int):(Int, Int) => Int ={
  	def sumF(a: Int, b:Int): Int =
  		if(a > b) 0
  		else f(a) + sumF(a+1,b)
  	sumF
  
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(32); 
  
    def sumInt = sum(x => x);System.out.println("""sumInt: => (Int, Int) => Int""");$skip(33); 
  def sumCubes = sum(x => x * x);System.out.println("""sumCubes: => (Int, Int) => Int""");$skip(30); val res$0 = 

	sumCubes(1,2) + sumInt(1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(18); val res$1 = 
	sum(x=>x*x)(1,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(33); val res$2 = 
	//same as
	( sum(x=>x*x) )(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(124); 
	
	//currying equivalet to upper
	def sum2(f:Int=>Int)(a:Int, b:Int) :Int=  {
	 if(a > b) 0
	 else f(a) + sum2(f)(a+1,b)
	};System.out.println("""sum2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(215); 
     //explanation
	//takes function as argument   returns function that takes two arg and    return INt
	//(Int => Int)                  =>  ( Int, Int )                       =>   Int
		
		def cubes(x:Int) = x *x;System.out.println("""cubes: (x: Int)Int""");$skip(21); val res$3 = 
		sum2(cubes)( 1, 2);System.out.println("""res3: Int = """ + $show(res$3));$skip(123); 
		
		def product(f:Int=>Int)(a:Int, b:Int) :Int=
			if(a > b ) 1 //unit for multiplication
			else f(a)* product(f)(a+1,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$4 = 
			
		product(x=>x*x)(3,4);System.out.println("""res4: Int = """ + $show(res$4));$skip(49); 
			
			def factorial(n:Int) = product(x=>x)(1,n);System.out.println("""factorial: (n: Int)Int""");$skip(16); val res$5 = 
			factorial(3);System.out.println("""res5: Int = """ + $show(res$5));$skip(168); 
			
			def mapReduce(f:Int => Int, combine:(Int,Int)=>Int, zero:Int) (a:Int, b:Int) :Int  =
			 if(a > b) zero
			 else combine(f(a), mapReduce(f,combine,zero)(a+1,b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(90); 
			 
			def productMR(f:Int=>Int)(a:Int, b:Int) :Int = mapReduce(f, (x,y) => x*y ,1)(a,b);System.out.println("""productMR: (f: Int => Int)(a: Int, b: Int)Int""");$skip(54); 
			
			def factorialMR(n:Int) = productMR(x=>x)(1, n);System.out.println("""factorialMR: (n: Int)Int""");$skip(18); val res$6 = 
			factorialMR(3);System.out.println("""res6: Int = """ + $show(res$6));$skip(83); 
			
			def sumMR(f:Int=>Int)(a:Int, b:Int) :Int= mapReduce(f, (x,y) => x+y,0)(a,b);System.out.println("""sumMR: (f: Int => Int)(a: Int, b: Int)Int""");$skip(53); 
			def sumCubesMR(a:Int, b:Int) = sumMR(x=>x*x)(a,b);System.out.println("""sumCubesMR: (a: Int, b: Int)Int""");$skip(20); val res$7 = 
			sumCubesMR(1, 3);System.out.println("""res7: Int = """ + $show(res$7))}
			
	}
  