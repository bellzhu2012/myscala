package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/28 9:49
  * @Description:
  * @Modified By: lenovo
  */
object Scala17_Collection_Method {
  def main(args: Array[String]): Unit = {
    // 集合常用方法
    val list: List[Int] = List(1,2,3,4)
    // 获取长度
//    println(list.length)
//    println(list.size)
    //遍历
//    list.foreach(println)
//    println(list.mkString("-"))
//    val iterator: Iterator[Int] = list.iterator
//    while(iterator.hasNext){
//      println(iterator.next())
//    }
    // 判断是否为空
//    println(list.isEmpty)
    // 针对数值型集合
    println(list.sum)
    println(list.max)
    println(list.min)
    println(list.product)
  }
}
