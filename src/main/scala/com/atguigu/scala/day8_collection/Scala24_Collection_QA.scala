package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 20:47
  * @Description:
  * @Modified By: lenovo
  */
object Scala24_Collection_QA {
  def main(args: Array[String]): Unit = {
    // 排序
    val list = List(1,4,3,2)
    val list1 = List("1", "11", "2")
    val list2 = List((30,"zhangsan"), (20,"wangwu"), (20, "lisi"))
    // list升序和降序
//    println(list.sortBy(x => x))
//    println(list.sortBy(x => x)(Ordering.Int.reverse))
    // list1升序和降序
//    println(list1.sortBy(x => x)(Ordering.String))
    println(list1.sortBy(x => x)(Ordering.String.reverse))
    // list2升序和降序
//    println(list2.sortBy(kv => {
//      kv._1
//    }))

    // 自定义排序 两两排序
    println(list2.sortWith(
      (left, right) => {
        if (left._1 > right._1) {
          true
        } else if (left._1 == right._1) {
          left._2 < right._2
        } else {
          false
        }
      }
    ))
  }
}
