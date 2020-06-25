package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 11:09
  * @Description:
  * @Modified By: lenovo
  */
object ImmutableList {
  def main(args: Array[String]): Unit = {
    // List是一个抽象类，使用伴生对象的apply方法构建
    val list: List[Int] = List(1,2,3,4)
    // 添加数据
    val list1: List[Int] = list :+ 5
    println(list)
    println(list1)
    println(list eq list1)
    val list2 = 0 +: list
    list2.foreach(println)
    list2.updated(0,3)
    list2.foreach(println)
  }
}
