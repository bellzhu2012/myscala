package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/29 14:49
  * @Description:
  * @Modified By: lenovo
  */
object Scala27_Collection_fold {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a"->1, "b"->2, "c"->2)
    println(map1)
    map1("e") = 2
    println(map1)
    val map2 = mutable.Map("a"->4, "d"->2, "c"->1)

    def fun(map:mutable.Map[String,Int], kv:(String, Int)):mutable.Map[String,Int]={
      val k = kv._1
      val v = kv._2
      val value = map.getOrElse(k, 0) + v
      map(k) = value
      map
    }
    // 折叠，初始值为map2
    val map: mutable.Map[String, Int] = map1.foldLeft(map2)(fun)
    println(map)
  }
}
