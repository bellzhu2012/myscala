package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:00
  * @Description:
  * @Modified By: lenovo
  */
object Scala24_Collection_QA1 {
  def main(args: Array[String]): Unit = {
    // 排序
    val ints = List(1,4,3,2)
    val ints1 = List("1", "11", "2")
    val ints2 = List((30,"zhangsan"), (20,"wangwu"), (20, "lisi"))

    println(ints2.sortBy(s => s)(Ordering.Tuple2(Ordering.Int, Ordering.String.reverse)))
    // 自定义类型排序
    println(ints2.sortWith(
      (left, right) => {
        if (left._1 > right._1) {
          true
        } else if (left._1 == right._1) {
          left._2 < right._2
        } else {
          false
        }
      }))
  }
}
