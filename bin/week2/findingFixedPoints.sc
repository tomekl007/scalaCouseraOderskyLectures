package week2
import math.abs

object findingFixedPoints {

val tolerance = 0.0001                            //> tolerance  : Double = 1.0E-4
def isCloseEnought(x:Double,y:Double):Boolean =
	abs((x-y)/x)/x <= tolerance               //> isCloseEnought: (x: Double, y: Double)Boolean
	
		def fixedPoint(f:Double => Double)(firstGuess:Double) = {
		
			def iterate(guess:Double):Double={
				println(guess)
				val next = f(guess)
				if(isCloseEnought(guess, next)) next
				else iterate(next)
				
			}
				
		iterate(firstGuess)
		
		
		}                                 //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
		
		fixedPoint(x=> 1 + x/2)(1)        //> 1.0
                                                  //| 1.5
                                                  //| 1.75
                                                  //| 1.875
                                                  //| 1.9375
                                                  //| 1.96875
                                                  //| 1.984375
                                                  //| 1.9921875
                                                  //| 1.99609375
                                                  //| 1.998046875
                                                  //| 1.9990234375
                                                  //| 1.99951171875
                                                  //| res0: Double = 1.999755859375
		
		//def sqrt(x:Int) = fixedPoint(y => x/y)(1)
    //it result in infinity loop
    
    def sqrtAvarage(x:Int) = fixedPoint(y => ( y+ x /y) / 2 )(1)
                                                  //> sqrtAvarage: (x: Int)Double
		sqrtAvarage(2)                    //> 1.0
                                                  //| 1.5
                                                  //| 1.4166666666666665
                                                  //| 1.4142156862745097
                                                  //| res1: Double = 1.4142135623746899
                                                  
		def avarageDump(f: Double => Double)(x:Double)= (x + f(x))/2
                                                  //> avarageDump: (f: Double => Double)(x: Double)Double
		       
		def sqrt(x:Int) = fixedPoint(avarageDump(y=> x/y))(1)
                                                  //> sqrt: (x: Int)Double
		sqrt(2)                           //> 1.0
                                                  //| 1.5
                                                  //| 1.4166666666666665
                                                  //| 1.4142156862745097
                                                  //| res2: Double = 1.4142135623746899

}