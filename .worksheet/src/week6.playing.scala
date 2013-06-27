package week6

import sun.org.mozilla.javascript.internal.ast.Yield

object playing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); 
  val v = Vector(1,2,3);System.out.println("""v  : scala.collection.immutable.Vector[Int] = """ + $show(v ));$skip(10); val res$0 = 
  
  1+:v;System.out.println("""res0: scala.collection.immutable.Vector[Int] = """ + $show(res$0));$skip(8); val res$1 = 
  v:+99;System.out.println("""res1: scala.collection.immutable.Vector[Int] = """ + $show(res$1));$skip(27); 
  
  val xs = Array(1,3,5);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(20); val res$2 = 
  xs map (x => x*3);System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(19); 
  
  val s="hEllo";System.out.println("""s  : String = """ + $show(s ));$skip(27); val res$3 = 
  s filter(c => c.isUpper);System.out.println("""res3: String = """ + $show(res$3));$skip(26); 
  val r:Range = 1 until 5;System.out.println("""r  : Range = """ + $show(r ));$skip(24); 
  val r2:Range = 1 to 6;System.out.println("""r2  : Range = """ + $show(r2 ));$skip(30); 
  val r3:Range = 1 to 10 by 3;System.out.println("""r3  : Range = """ + $show(r3 ));$skip(31); 
  val r4:Range = 10 to 1 by -2;System.out.println("""r4  : Range = """ + $show(r4 ));$skip(31); val res$4 = 
  
  s exists (c => c.isUpper);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(28); val res$5 = 
  s forall (c => c.isUpper);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(35); 
  
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(32); val res$6 = 
  															
  pairs.unzip;System.out.println("""res6: (List[Int], List[Char]) = """ + $show(res$6));$skip(31); val res$7 = 
  s flatMap( c => List('.',c));System.out.println("""res7: String = """ + $show(res$7));$skip(9); val res$8 = 
  xs.sum;System.out.println("""res8: Int = """ + $show(res$8));$skip(9); val res$9 = 
  xs.max;System.out.println("""res9: Int = """ + $show(res$9));$skip(39); 
  val fst:Vector[Double] = Vector(1,2);System.out.println("""fst  : Vector[Double] = """ + $show(fst ));$skip(40); 
  val scnd:Vector[Double] = Vector(3,4);System.out.println("""scnd  : Vector[Double] = """ + $show(scnd ));$skip(116); 
  
  	def scalarProduct(xs:Vector[Double], ys:Vector[Double]):Double =
  		(xs zip ys).map(xy => xy._1 * xy._2).sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(126); 
  		
  		def scalarProductForExp(xs:Vector[Double], ys:Vector[Double]):Double =
  			(for( (x,y) <- xs zip ys) yield x*y).sum;System.out.println("""scalarProductForExp: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(81); val res$10 = 
  					
  			
  		//or .map( case(x,y) => x*y)
  		
  		scalarProduct(fst, scnd);System.out.println("""res10: Double = """ + $show(res$10));$skip(35); val res$11 = 
  		scalarProductForExp(fst, scnd);System.out.println("""res11: Double = """ + $show(res$11));$skip(79); 
  		
  		
  		def isPrime(n:Int) : Boolean = (2 until n) forall (d=> n%d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(19); 
  		
  		val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(106); val res$12 = 
  		(1 until n ) flatMap(i => (1 until i) map (j=> (i,j) )  ) filter (pair => isPrime(pair._1 + pair._2));System.out.println("""res12: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$12));$skip(130); val res$13 = 
                                                  
			for{i <-1 until n
					j <- 1 until i
					if isPrime(i+j)
				}yield (i,j)
                                                  
  		 case class Person(name:String, age:Int);System.out.println("""res13: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$13));$skip(171); 
  		 
  		 val persons = List(Person("kowalski",33), Person("mlody",12));System.out.println("""persons  : List[week6.playing.Person] = """ + $show(persons ));$skip(63); val res$14 = 
  		 
  		 
  		 for(p <- persons if p.age > 20) yield p.name;System.out.println("""res14: List[String] = """ + $show(res$14));$skip(79); val res$15 = 
  			//or
  				
  				persons filter(p=> p.age > 20) map (p=> (p.name,p.age));System.out.println("""res15: List[(String, Int)] = """ + $show(res$15))}
  		 
  	
  }
