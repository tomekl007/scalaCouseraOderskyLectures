package week4.idelizedBoolean

abstract class Boolean {
  
  	def ifThenElse[T](t: => T, e: => T): T
  	
  	def && (x: => Boolean) : Boolean = ifThenElse(x, False)
  	def || (x: => Boolean) : Boolean = ifThenElse(True, x)
  	def unary_! : Boolean = ifThenElse(False, True)
  	
  	def == (x: => Boolean) : Boolean = ifThenElse(x, x.unary_!)
  	def != (x: => Boolean) : Boolean = ifThenElse(x.unary_!, x)
  	
  	def < (x: => Boolean) = ifThenElse(False, x)
  	
  	

}

object True extends Boolean{
  //jesli true zwroci pierwsze experssion
  def ifThenElse[T](t: => T, e: => T) = t
}

object False extends Boolean{
  //jesli false to zwroci dugie expression
  def ifThenElse[T](t: => T, e: => T) = e
}
