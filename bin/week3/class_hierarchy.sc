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
    }
    val s = new NonEmpty(3,new Empty, new Empty)  //> s  : week3.class_hierarchy.NonEmpty = {.3.}
    val s2 = s include 4                          //> s2  : week3.class_hierarchy.IntSet = {.3{.4.}}
    
    val s3 = new NonEmpty(5,new Empty, new Empty) //> s3  : week3.class_hierarchy.NonEmpty = {.5.}
    
    s2 union s3                                   //> res0: week3.class_hierarchy.IntSet = {{{.3.}4.}5.}
    
    def error(msg:String) = throw new Error(msg)  //> error: (msg: String)Nothing
    val x = null                                  //> x  : Null = null
    val y:String=null                             //> y  : String = null
    
    if (true) 1 else false                        //> res1: AnyVal = 1
    
    List(List(true,false) , List(3))              //> res2: List[List[AnyVal]] = List(List(true, false), List(3))
    
    
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
    }                                             //> findElemInList: [T](n: Int, list: week3.List[T])T
    //OR
    def findElemInList2[T](n: Int, list: List[T]): T = {
    		if(list.isEmpty) throw new ArrayIndexOutOfBoundsException
         if ( n==0) list.head
         else findElemInList2( n - 1, list.tail)
    }                                             //> findElemInList2: [T](n: Int, list: week3.List[T])T
    
    val list = new Cons(1, new Cons(2,new Cons(3, new Nil())))
                                                  //> list  : week3.Cons[Int] = week3.Cons@10c03c6
    
    findElemInList2(2, list)                      //> res3: Int = 3
      findElemInList(2, list)                     //> res4: Int = 3
      findElemInList2(-1, list)                   //> java.lang.ArrayIndexOutOfBoundsException
                                                  //| 	at week3.class_hierarchy$$anonfun$main$1.findElemInList2$1(week3.class_h
                                                  //| ierarchy.scala:72)
                                                  //| 	at week3.class_hierarchy$$anonfun$main$1.apply$mcV$sp(week3.class_hierar
                                                  //| chy.scala:81)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.class_hierarchy$.main(week3.class_hierarchy.scala:40)
                                                  //| 	at week3.class_hierarchy.main(week3.class_hierarchy.scala)
}