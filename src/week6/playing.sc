package week6

import sun.org.mozilla.javascript.internal.ast.Yield

object playing {
  val v = Vector(1,2,3)                           //> v  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  
  1+:v                                            //> res0: scala.collection.immutable.Vector[Int] = Vector(1, 1, 2, 3)
  v:+99                                           //> res1: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 99)
  
  val xs = Array(1,3,5)                           //> xs  : Array[Int] = Array(1, 3, 5)
  xs map (x => x*3)                               //> res2: Array[Int] = Array(3, 9, 15)
  
  val s="hEllo"                                   //> s  : String = hEllo
  s filter(c => c.isUpper)                        //> res3: String = E
  val r:Range = 1 until 5                         //> r  : Range = Range(1, 2, 3, 4)
  val r2:Range = 1 to 6                           //> r2  : Range = Range(1, 2, 3, 4, 5, 6)
  val r3:Range = 1 to 10 by 3                     //> r3  : Range = Range(1, 4, 7, 10)
  val r4:Range = 10 to 1 by -2                    //> r4  : Range = Range(10, 8, 6, 4, 2)
  
  s exists (c => c.isUpper)                       //> res4: Boolean = true
  s forall (c => c.isUpper)                       //> res5: Boolean = false
  
  val pairs = List(1,2,3) zip s                   //> pairs  : List[(Int, Char)] = List((1,h), (2,E), (3,l))
  															
  pairs.unzip                                     //> res6: (List[Int], List[Char]) = (List(1, 2, 3),List(h, E, l))
  s flatMap( c => List('.',c))                    //> res7: String = .h.E.l.l.o
  xs.sum                                          //> res8: Int = 9
  xs.max                                          //> res9: Int = 5
  val fst:Vector[Double] = Vector(1,2)            //> fst  : Vector[Double] = Vector(1.0, 2.0)
  val scnd:Vector[Double] = Vector(3,4)           //> scnd  : Vector[Double] = Vector(3.0, 4.0)
  
  	def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double =
  		(xs zip ys).map(xy => xy._1 * xy._2).sum
                                                  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double
  		
  		def scalarProductForExp(xs:Vector[Double], ys:Vector[Double]):Double =
  			(for( (x,y) <- xs zip ys) yield x*y).sum
                                                  //> scalarProductForExp: (xs: Vector[Double], ys: Vector[Double])Double
  					
  			
  		//or .map( case(x,y) => x*y)
  		
  		scalarProduct(fst, scnd)          //> res10: Double = 11.0
  		scalarProductForExp(fst, scnd)    //> res11: Double = 11.0
  		
  		
  		def isPrime(n:Int) : Boolean = (2 until n) forall (d=> n%d != 0)
                                                  //> isPrime: (n: Int)Boolean
  		
  		val n = 7                         //> n  : Int = 7
  		(1 until n ) flatMap(i => (1 until i) map (j=> (i,j) )  ) filter (pair => isPrime(pair._1 + pair._2))
                                                  //> res12: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
			for{i <-1 until n
					j <- 1 until i
					if isPrime(i+j)
				}yield (i,j)      //> res13: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3
                                                  //| ,2), (4,1), (4,3), (5,2), (6,1), (6,5))
                                                  
  		 case class Person(name:String, age:Int)
  		 
  		 val persons = List(Person("kowalski",33), Person("mlody",12))
                                                  //> persons  : List[week6.playing.Person] = List(Person(kowalski,33), Person(ml
                                                  //| ody,12))
  		 
  		 
  		 for(p <- persons if p.age > 20) yield p.name
                                                  //> res14: List[String] = List(kowalski)
  			//or
  				
  				persons filter(p=> p.age > 20) map (p=> (p.name,p.age))
                                                  //> res15: List[(String, Int)] = List((kowalski,33))
  		 
  	
  }