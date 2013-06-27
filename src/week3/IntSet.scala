package week3

 abstract class IntSet{
    	def contains(x:Int):Boolean
     	def include(x:Int):IntSet
     	def union(other:IntSet): IntSet
     
    
    }
    
    class Empty extends IntSet{
    	def contains(x:Int):Boolean=false
    	def include(x:Int):IntSet= new NonEmpty(x,new Empty,new Empty)//it create singleton not new instance Empty()
    	override def toString = "."
    	def union(other:IntSet):IntSet = other
    }
    
    class NonEmpty(elem:Int, left:IntSet, right:IntSet) extends IntSet{
    		def contains(x:Int):Boolean={
    			if(x < elem) left contains x
    			else if(x > elem) right contains x
    			else true
    		}
    		
    		def include(x:Int):IntSet= {
    			if (x < elem) new NonEmpty(elem,left include x,right)
    			else if(x > elem) new NonEmpty(elem, left, right include x)
    			else this
    		
    		
    		}
    
        override def toString= "{" + left  + elem +  right + "}"
        
        def union(other:IntSet):IntSet={
        	((left union right)union other) include elem
        }
    }