package cn.itcast.scala

class RDDdemo {
  def main(args: Array[String]): Unit = {

    //todo:通过并行化生成rdd
    val rdd1=sc.parallelize(List(5,6,4,7,3,8,2,9,1,10))
    //todo：对rdd1里的每一个元素乘2然后排序
    val rdd2=rdd1.map(_*2).sortBy(x=>x,true)
    //todo:过滤出大于等于5的元素
    val rdd3=rdd2.filter(_>=5)
    //todo:将元素以数组的方式在客户端显示
    rdd3.collect



  }

}
