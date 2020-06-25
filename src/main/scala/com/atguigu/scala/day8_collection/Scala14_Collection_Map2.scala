package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 21:51
  * @Description:
  * @Modified By: lenovo
  */
object Scala14_Collection_Map2 {
  def main(args: Array[String]): Unit = {
    val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)
    // Option:选项类型
    val maybeInt: Option[Int] = map.get("a")
    println(maybeInt)
    val result: Option[Int] = map.get("d")
    println(result)
//    println(result.get)
    println(result.isEmpty)
    println(result.getOrElse(-1))
    val i: Int = map.getOrElse("a",-1)
    println(i)
  }

}
