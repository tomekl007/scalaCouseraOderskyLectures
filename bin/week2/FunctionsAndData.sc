package week2

object FunctionsAndData {
  new Rational(1,2)                               //> res0: week2.Rational = 1/2
  
 def addRational(r:Rational, s:Rational):Rational={
 new Rational(
 							r.number * s.denom + s.number * r.denom,
 							r.denom * s.denom)
	}                                         //> addRational: (r: week2.Rational, s: week2.Rational)week2.Rational
 	def makeString(r:Rational)=
 	  r.number + "/" + r.denom                //> makeString: (r: week2.Rational)String
 

 		
 	makeString(addRational(new Rational(1,2), new Rational(2,3)))
                                                  //> res1: String = 7/6
 	
 	new Rational(2,3) + new Rational(3,4)     //> res2: week2.Rational = 17/12
 	
 	val r = new Rational(1,2)                 //> r  : week2.Rational = 1/2
	-r                                        //> res3: week2.Rational = 1/-2
 	
 	val r1 = new Rational(1,3)                //> r1  : week2.Rational = 1/3
 	var r2 = new Rational(5,7)                //> r2  : week2.Rational = 5/7
 	var r3 = new Rational(3,2)                //> r3  : week2.Rational = 3/2
 	
 	r1 - r2 - r3                              //> res4: week2.Rational = -79/42
 	
 	r2.<(r1)                                  //> res5: Boolean = false
 	
 	r3.max(r2)                                //> res6: week2.Rational = 3/2
 	
 //	val not = new Rational(1,0)
  val total = new Rational(2)                     //> total  : week2.Rational = 2/1
 
 	val res = r1 max r2                       //> res  : week2.Rational = 5/7
 	

  
   
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