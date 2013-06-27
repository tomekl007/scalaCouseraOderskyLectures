package week2

object currying {
  
  def sum(f:Int => Int):(Int, Int) => Int ={
  	def sumF(a: Int, b:Int): Int =
  		if(a > b) 0
  		else f(a) + sumF(a+1,b)
  	sumF
  
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  
    def sumInt = sum(x => x)                      //> sumInt: => (Int, Int) => Int
  def sumCubes = sum(x => x * x)                  //> sumCubes: => (Int, Int) => Int

	sumCubes(1,2) + sumInt(1,2)               //> res0: Int = 8
	sum(x=>x*x)(1,3)                          //> res1: Int = 14
	//same as
	( sum(x=>x*x) )(1,3)                      //> res2: Int = 14
	
	//currying equivalet to upper
	def sum2(f:Int=>Int)(a:Int, b:Int) :Int=  {
	 if(a > b) 0
	 else f(a) + sum2(f)(a+1,b)
	}                                         //> sum2: (f: Int => Int)(a: Int, b: Int)Int
     //explanation
	//takes function as argument   returns function that takes two arg and    return INt
	//(Int => Int)                  =>  ( Int, Int )                       =>   Int
		
		def cubes(x:Int) = x *x           //> cubes: (x: Int)Int
		sum2(cubes)( 1, 2)                //> res3: Int = 5
		
		def product(f:Int=>Int)(a:Int, b:Int) :Int=
			if(a > b ) 1 //unit for multiplication
			else f(a)* product(f)(a+1,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
			
		product(x=>x*x)(3,4)              //> res4: Int = 144
			
			def factorial(n:Int) = product(x=>x)(1,n)
                                                  //> factorial: (n: Int)Int
			factorial(3)              //> res5: Int = 6
			
			def mapReduce(f:Int => Int, combine:(Int,Int)=>Int, zero:Int) (a:Int, b:Int) :Int  =
			 if(a > b) zero
			 else combine(f(a), mapReduce(f,combine,zero)(a+1,b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b
                                                  //| : Int)Int
			 
			def productMR(f:Int=>Int)(a:Int, b:Int) :Int = mapReduce(f, (x,y) => x*y ,1)(a,b)
                                                  //> productMR: (f: Int => Int)(a: Int, b: Int)Int
			
			def factorialMR(n:Int) = productMR(x=>x)(1, n)
                                                  //> factorialMR: (n: Int)Int
			factorialMR(3)            //> res6: Int = 6
			
			def sumMR(f:Int=>Int)(a:Int, b:Int) :Int= mapReduce(f, (x,y) => x+y,0)(a,b)
                                                  //> sumMR: (f: Int => Int)(a: Int, b: Int)Int
			def sumCubesMR(a:Int, b:Int) = sumMR(x=>x*x)(a,b)
                                                  //> sumCubesMR: (a: Int, b: Int)Int
			sumCubesMR(1, 3)          //> res7: Int = 14
			
	}
  