package week4.patternmaching

trait Expr {

}

case class Number(n:Int) extends Expr
case class Sum(e1:Expr, e2:Expr) extends Expr
case class Prod(e1:Expr, e2:Expr) extends Expr
case class Var(n:String) extends Expr


object MainObject{
  def main(args: Array[String]) {
    
   println(eval(Sum(Number(1),Number(2))))  
   println(show(Sum(Number(1),Number(2))))
   println(show(Sum(Prod(Number(2), Var("x")), Var("y"))))
   
   println(show(Prod(Sum(Number(2), Var("x")), Var("y"))))
  
   val fruit = List("orange","appple","grape")
   val fruit2 = "oranges" ::("apples" :: ("grape" :: Nil ))//same 
   val frutt3 = "oganges"::"apples"::"grape"::Nil//same
   val fruit4 = Nil.::("grape").::("apples").::("oranges") //same
   val temp = fruit.tail.head
   
  }
 
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
   
  }
  
  def show(e:Expr): String = e match {
    case Number(n) => n.toString
    case Sum(e1,e2) => "(" + show(e1) + " + " + show(e2) + ")"
    case Var(n) => n
    case Prod(e1,e2) => show(e1) + " * " + show(e2)
    
  }
  
}

