package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 21:43
  * @Description:
  * @Modified By: lenovo
  */
object Scala13_Collection_Map1 {
  def main(args: Array[String]): Unit = {
    // 可变map：scala.collection.mutable.Map
    val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2)
    map.put("c",3)
    println(map)
    // 修改数据
//    map.update("c",4)
    map("c") = 4
    println(map)
    map.remove("c")
    println(map)
  }
}
