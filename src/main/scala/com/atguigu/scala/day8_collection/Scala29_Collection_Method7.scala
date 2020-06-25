package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:52
  * @Description:
  * @Modified By: lenovo
  */
object Scala29_Collection_Method7 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a"->1,"b"->2,"c"->3)
    val map2 = mutable.Map("a"->4,"d"->5,"c"->6)
    val newMap = map1.foldLeft(map2)(
      (map, kv) => {
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k, 0) + v
        map
      })
    println(newMap)
  }
}
