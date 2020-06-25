package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/28 9:33
  * @Description:
  * @Modified By: lenovo
  */
object Scala15_Collectin_Tuple {
  def main(args: Array[String]): Unit = {
    // scala有一种特殊结构，能够对多个数据进行封装，形成一个整体
    // 元组，即元素的组合
    val data: (Int, String, Int, String) = (1,"lisi",30,"guangxi")
    // 元组中的数据一般是没有关系的，可以通过顺序访问
    // 元组最多能够放置22条数据
    // 使用元组._序号访问
    println(data)
    println(data._1)
    println(data._2)
    println(data._3)
    println(data._4)
    val iterator: Iterator[Any] = data.productIterator
    while(iterator.hasNext){
      println(iterator.next())
    }
    println(data.productElement(3))
  }

}
