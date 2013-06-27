package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Newton sqrt

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      guess * guess - x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double
     
     sqrt(2)                                      //> res0: Double = 1.0
     
     
     //not tail recursio because of n*
     def factorial2(n:Int) :Int =
     if (n == 0) 1 else n * factorial2(n-1)       //> factorial2: (n: Int)Int
     
     //@tailrec
     def factorial(n:Int) :Int={
     	def loop(acc:Int, n:Int):Int=
     		if(n==0) acc
     		else loop(acc*n,n-1)
     		
     	loop(1,n)
     }                                            //> factorial: (n: Int)Int

		factorial(4)                      //> res1: Int = 24
		factorial2(4)                     //> res2: Int = 24
     
}