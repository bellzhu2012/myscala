package com.atguigu.scala.day8_collection

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * @Author: lenovo
  * @Time: 2020/5/29 9:01
  * @Description:
  * @Modified By: lenovo
  */
object Test1 {
  def main(args: Array[String]): Unit = {
//    val list: List[(String, Int)] = List(
//      ("hello", 4),
//      ("hello spark", 3),
//      ("hello spark scala", 2),
//      ("hello spark scala hive", 1)
//    )
//
//    val buffer: ArrayBuffer[String] = new ArrayBuffer[String]()
//    for (kv <- list){
//      val array = Array.fill[String](kv._2)(kv._1)
//      buffer.appendAll(array)
//
//    }
//    println(buffer)
    val list = List(1,2,3,4)
    println(list.map(_*2))
  }
}
