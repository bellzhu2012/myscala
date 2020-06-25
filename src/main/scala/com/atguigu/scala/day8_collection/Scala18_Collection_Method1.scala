package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/28 10:05
  * @Description:
  * @Modified By: lenovo
  */
object Scala18_Collection_Method1 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3,4)
    // 头和尾
    println(list.head)
    println(list.tail)
    //初始和最后
    println(list.init)
    println(list.last)
    // 反转
    val reverseList: List[Int] = list.reverse
    println(reverseList)
    // 去重
    println(list.distinct)
    println(list.toSet)
    // 判断元素是否存在
    println(list.contains(5))


    // 从左侧拿取数据
    println(list.take(3))
    // 从右侧拿取数据
    println(list.takeRight(3))

    // 丢弃数据
    println(list.drop(1))
    println(list.dropRight(2))
  }
}
