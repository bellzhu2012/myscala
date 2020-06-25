package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 20:01
  * @Description:
  * @Modified By: lenovo
  */
object Scala05_Collection_Array4 {
  def main(args: Array[String]): Unit = {
    val immutableArray: Array[Int] = Array(1,2,3)
    val buffer: mutable.Buffer[Int] = immutableArray.toBuffer
    val array: Array[Int] = buffer.toArray
  }
}
