package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:05
  * @Description:
  * @Modified By: lenovo
  */
object Scala25_Collection_Method33 {
  def main(args: Array[String]): Unit = {
      // 集合常用方法
    val list1 = List(1,2,3,4)
    val list2 = List(3,4,5,6)
    // 合集
    println(list1.union(list2))
    // 交集
    println(list1.intersect(list2))
    // 差集
    println(list1.diff(list2))
    // 并集
    println(list1.union(list2).diff(list1.intersect(list2)))

    // 拉链
    println(list1.zip(list2)) // 多出的数据会自动丢弃
    println(list2.zipWithIndex) //List((3,0), (4,1), (5,2), (6,3))
    val list3 = List(1,2,3,4,5,6,7,8)
    // 默认步长是1
//   val iterator: Iterator[List[Int]] = list3.sliding(3)
//    while(iterator.hasNext){
//        println(iterator.next())
//    }
    val iterator: Iterator[List[Int]] = list3.sliding(3,3)
    while(iterator.hasNext){
      println(iterator.next())
    }


  }
}
