package cn.itcast.scala

object VariableDemo {
  def main(args: Array[String]): Unit = {
    val x = 1
    //var s="hello"
    //val str:String = "itcast"
    val y = if(x>0)1 else -1
    println(y)
    var z = if(x>1)1 else "error"
    println(z)
    var m = if(x>2)1
    println(m)
    val n = if (x>2) 1 else ()
    println(n)
    val k = if (x<0) 0
    else if (x>=1) 1 else -1
    println(k)
  }

}
