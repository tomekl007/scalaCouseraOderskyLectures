package week1
import scala.math._

object NewtonSqrt extends App {
  
  def loop : Int = loop
 	def constOne(x:Int, y: => Int) = 1
 	println(constOne(1+2,loop))//thanks to => execution will be derefered
 	
 	//this is expression not statement
 	def abs(x:Int) = if (x >= 0) x else -x

  //Newton sqrt
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)
    
    def isGoodEnough(guess: Double, x: Double) : Boolean = false
      //abs(guess * guess - x)   < 0.001
    
     def improve(guess: Double, x: Double)=
       (guess + x / guess) / 2
       
     def sqrt(x:Double) = sqrtIter(1.0,x)
     
     sqrt(2)
 

}