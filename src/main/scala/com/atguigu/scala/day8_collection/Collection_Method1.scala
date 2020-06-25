package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 14:15
  * @Description:
  * @Modified By: lenovo
  */
object Collection_Method1 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3,4,5)
    println(list.head)
    println(list.last)
    println(list.tail)
    println(list.init)
    println(list.reverse.head)
    println(list)
    println(list.contains(6))

  }
}
