package week2
import math.abs

object findingFixedPoints {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(77); 
def isCloseEnought(x:Double,y:Double):Boolean =
	abs((x-y)/x)/x <= tolerance;System.out.println("""isCloseEnought: (x: Double, y: Double)Boolean""");$skip(257); 
	
		def fixedPoint(f:Double => Double)(firstGuess:Double) = {
		
			def iterate(guess:Double):Double={
				println(guess)
				val next = f(guess)
				if(isCloseEnought(guess, next)) next
				else iterate(next)
				
			}
				
		iterate(firstGuess)
		
		
		};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(32); val res$0 = 
		
		fixedPoint(x=> 1 + x/2)(1);System.out.println("""res0: Double = """ + $show(res$0));$skip(152); 
		
		//def sqrt(x:Int) = fixedPoint(y => x/y)(1)
    //it result in infinity loop
    
    def sqrtAvarage(x:Int) = fixedPoint(y => ( y+ x /y) / 2 )(1);System.out.println("""sqrtAvarage: (x: Int)Double""");$skip(17); val res$1 = 
		sqrtAvarage(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(114); 
                                                  
		def avarageDump(f: Double => Double)(x:Double)= (x + f(x))/2;System.out.println("""avarageDump: (f: Double => Double)(x: Double)Double""");$skip(66); 
		       
		def sqrt(x:Int) = fixedPoint(avarageDump(y=> x/y))(1);System.out.println("""sqrt: (x: Int)Double""");$skip(10); val res$2 = 
		sqrt(2);System.out.println("""res2: Double = """ + $show(res$2))}

}
