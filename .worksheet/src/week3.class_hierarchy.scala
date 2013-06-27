package week3

import week3._
object class_hierarchy {
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
    };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1138); 
    val s = new NonEmpty(3,new Empty, new Empty);System.out.println("""s  : week3.class_hierarchy.NonEmpty = """ + $show(s ));$skip(25); 
    val s2 = s include 4;System.out.println("""s2  : week3.class_hierarchy.IntSet = """ + $show(s2 ));$skip(55); 
    
    val s3 = new NonEmpty(5,new Empty, new Empty);System.out.println("""s3  : week3.class_hierarchy.NonEmpty = """ + $show(s3 ));$skip(21); val res$0 = 
    
    s2 union s3;System.out.println("""res0: week3.class_hierarchy.IntSet = """ + $show(res$0));$skip(54); 
    
    def error(msg:String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(17); 
    val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(22); 
    val y:String=null;System.out.println("""y  : String = """ + $show(y ));$skip(32); val res$1 = 
    
    if (true) 1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(42); val res$2 = 
    
    List(List(true,false) , List(3));System.out.println("""res2: List[List[AnyVal]] = """ + $show(res$2));$skip(290); 
    
    
    def findElemInList[T](n: Int, list: List[T]): T = {
      var i = 0
      def take(list: List[T]): T = {
      	if (n == 0) list.head
        if (i == n)
          list.head
        else {
          i = i + 1
          take(list.tail)
        }
      }
      take(list)
    };System.out.println("""findElemInList: [T](n: Int, list: week3.List[T])T""");$skip(215); 
    //OR
    def findElemInList2[T](n: Int, list: List[T]): T = {
    		if(list.isEmpty) throw new ArrayIndexOutOfBoundsException
         if ( n==0) list.head
         else findElemInList2( n - 1, list.tail)
    };System.out.println("""findElemInList2: [T](n: Int, list: week3.List[T])T""");$skip(68); 
    
    val list = new Cons(1, new Cons(2,new Cons(3, new Nil())));System.out.println("""list  : week3.Cons[Int] = """ + $show(list ));$skip(34); val res$3 = 
    
    findElemInList2(2, list);System.out.println("""res3: Int = """ + $show(res$3));$skip(30); val res$4 = 
      findElemInList(2, list);System.out.println("""res4: Int = """ + $show(res$4));$skip(32); val res$5 = 
      findElemInList2(-1, list);System.out.println("""res5: Int = """ + $show(res$5))}
}
