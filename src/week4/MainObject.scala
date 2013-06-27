package week4

import week4.Zero
import week4.idelizedBoolean.True
import week4.idelizedBoolean.False

object MainObject {
  
    def main(args: Array[String]) {
    
      val n1:Nat = new Suc(Zero);
      println(n1.sucessor);
      
      println(True.&&(False))
      println(True.&&(True))
      println(False.unary_!)
      println(False==False)
      println(False!=True)
      println(True==False)
      
    
      
    }
    

}