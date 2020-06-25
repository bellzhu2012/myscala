package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:14
  * @Description:
  * @Modified By: lenovo
  */
object Scala25_Collection_Method333 {
  def main(args: Array[String]): Unit = {
      // 集合常用方法
    val list1 = List(1,2,3,4)
    val list2 = List(3,4,5,6,7)
    // 合集
    println(list1.union(list2))
    // 交集
    println(list1.intersect(list2))
    // 差集
    println(list1.diff(list2))
    // 并集
    println(list1.union(list2).diff(list1.intersect(list2)))

    // 拉链
    println(list1.zip(list2))

    // 自关联拉链
    println(list1.zipWithIndex) //第二位元素是index

    // 滑动窗口
    val list = List(1,2,3,4,5,6,7,8)
//    val iterator: Iterator[List[Int]] = list.sliding(3)
//    while(iterator.hasNext){
//      println(iterator.next())
//    }
    val iterator: Iterator[List[Int]] = list.sliding(3,3)
    while(iterator.hasNext){
      println(iterator.next())
    }
  }
}
