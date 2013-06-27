package week4




//Natural Number
abstract class Nat{
  def isZero:Boolean
  def predecessor:Nat 
   def sucessor:Nat = new Suc(this)
  def + (that:Nat):Nat
  def - (that:Nat):Nat
  
  
}

object Zero extends Nat{
  
  def isZero:Boolean = true
  def predecessor:Nat = throw new Error("0.predecessor")
 
  def + (that:Nat):Nat = that
  def - (that:Nat):Nat = if(that.isZero) this else throw new Error("negative number")
  
}

class Suc(n:Nat) extends Nat{
    
  def isZero:Boolean = false
  def predecessor:Nat = n
 
  def + (that:Nat):Nat = new Suc(n + that)
  def - (that:Nat):Nat = if (that.isZero) that else n - that.predecessor
  
   //override def toString() = n
  
  
}