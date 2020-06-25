package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/28 9:43
  * @Description:
  * @Modified By: lenovo
  */
object Scala16_Collection_Tuple1 {
  def main(args: Array[String]): Unit = {
    // 如果元组中的元素只有两个，这样的元组称为对偶元组
    // 也称为键值对
    val data1 = ("a", 1)
    val data2 = ("b", 2)
//    val data = "a" -> 1
    val map: mutable.Map[String, Int] = mutable.Map(data1,data2)
    println(map)
    for( kv <- map){
        println(kv._1 +"->"+ kv.productElement(1))
    }
  }
}
