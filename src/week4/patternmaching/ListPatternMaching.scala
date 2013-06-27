package week4.patternmaching

object ListPatternMaching {
  
  def main(args: Array[String]) {
    val list = List(9,3,2,7)
    println(isort(list))
  
  }
  
  def isort(xs: List[Int]):List[Int] = xs match{
    case List() => List()
    case y::ys => insert(y, isort(ys)) //ys have at least one element "y"
  }
  
  def insert(x:Int, xs:List[Int]):List[Int]= xs match {
    case List() => List(x)
    case y::ys => if(x <= y) x::xs else y::insert(x,ys)
  }
  

}