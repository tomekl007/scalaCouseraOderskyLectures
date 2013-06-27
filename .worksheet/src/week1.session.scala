package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(329); 
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
  };System.out.println("""sqrt: (x: Double)Double""");$skip(19); val res$0 = 
     
     sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(129); 
     
     
     //not tail recursio because of n*
     def factorial2(n:Int) :Int =
     if (n == 0) 1 else n * factorial2(n-1);System.out.println("""factorial2: (n: Int)Int""");$skip(170); 
     
     //@tailrec
     def factorial(n:Int) :Int={
     	def loop(acc:Int, n:Int):Int=
     		if(n==0) acc
     		else loop(acc*n,n-1)
     		
     	loop(1,n)
     };System.out.println("""factorial: (n: Int)Int""");$skip(16); val res$1 = 

		factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(16); val res$2 = 
		factorial2(4);System.out.println("""res2: Int = """ + $show(res$2))}
     
}
