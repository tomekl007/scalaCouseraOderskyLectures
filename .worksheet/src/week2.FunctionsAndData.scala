package week2

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); val res$0 = 
  new Rational(1,2);System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(149); 
  
 def addRational(r:Rational, s:Rational):Rational={
 new Rational(
 							r.number * s.denom + s.number * r.denom,
 							r.denom * s.denom)
	};System.out.println("""addRational: (r: week2.Rational, s: week2.Rational)week2.Rational""");$skip(59); 
 	def makeString(r:Rational)=
 	  r.number + "/" + r.denom;System.out.println("""makeString: (r: week2.Rational)String""");$skip(71); val res$1 = 
 

 		
 	makeString(addRational(new Rational(1,2), new Rational(2,3)));System.out.println("""res1: String = """ + $show(res$1));$skip(43); val res$2 = 
 	
 	new Rational(2,3) + new Rational(3,4);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(31); 
 	
 	val r = new Rational(1,2);System.out.println("""r  : week2.Rational = """ + $show(r ));$skip(4); val res$3 = 
	-r;System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(32); 
 	
 	val r1 = new Rational(1,3);System.out.println("""r1  : week2.Rational = """ + $show(r1 ));$skip(29); 
 	var r2 = new Rational(5,7);System.out.println("""r2  : week2.Rational = """ + $show(r2 ));$skip(29); 
 	var r3 = new Rational(3,2);System.out.println("""r3  : week2.Rational = """ + $show(r3 ));$skip(18); val res$4 = 
 	
 	r1 - r2 - r3;System.out.println("""res4: week2.Rational = """ + $show(res$4));$skip(14); val res$5 = 
 	
 	r2.<(r1);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(16); val res$6 = 
 	
 	r3.max(r2);System.out.println("""res6: week2.Rational = """ + $show(res$6));$skip(66); 
 	
 //	val not = new Rational(1,0)
  val total = new Rational(2);System.out.println("""total  : week2.Rational = """ + $show(total ));$skip(24); 
 
 	val res = r1 max r2;System.out.println("""res  : week2.Rational = """ + $show(res ))}
 	

  
   
}

 class Rational(x:Int, y:Int){
    require(y!=0,"denominator must be nonzero")
    
    //contructor
    def this(x:Int) = this(x,1)
 
 		private def gcd(a:Int, b:Int):Int = if( b ==0 ) a else gcd(b, a % b)//greateastCommonDivisor
 		private val g = gcd(x,y)
  	val number = x/g
  	val denom = y/g
  	
  	def +(that:Rational)=
  		new Rational(number * that.denom +that.number * denom,
  								denom * that.denom)
  								
	override def toString = number + "/" + denom
	
		def unary_- :Rational=
			new Rational(-number,denom)
			
			def -(that:Rational)= this + -that
				//new Rational(number * that.denom - that.number * denom, denom* that.denom )
				
		 def max(that:Rational) = if (this < (that) ) that else this
			
				
		def <(that:Rational) =  number * that.denom < that.number * denom

 
  }
