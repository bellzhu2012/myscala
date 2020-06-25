package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 10:41
  * @Description:
  * @Modified By: lenovo
  */
object Scala25_Collection_Method3 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4)
    val list2 = List(3,4,5,6,7)
    // 合集
    val list3 = list1.union(list2)
//    println(list3) //List(1, 2, 3, 4, 3, 4, 5, 6，7)
    // 交集
//    println(list1.intersect(list2)) //List(3, 4)
    // 差集
//    println(list1.diff(list2)) // List(1, 2)
    // 数据关联：拉链（位置关联,形成tuple）
    val zipList: List[(Int, Int)] = list1.zip(list2)
//    println(zipList) //List((1,3), (2,4), (3,5), (4,6))
    // 位置缺失？最后的数据会丢失
//    println(list1.zip(list1))
//    println(list2.zipWithIndex)
    // 滑动窗口
    // 参数说明：size--窗口长度，step--步长，默认是1
    // sliding(size:Int, step:Int)
    val iterator: Iterator[List[Int]] = list3.sliding(3,3)
    while(iterator.hasNext){
      println(iterator.next())
    }

  }
}
