package com.atguigu.scala.day7_array

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:20
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTransfer2 {
  def main(args: Array[String]): Unit = {
    val buffer: mutable.Buffer[Int] = Array(1,2,3).toBuffer
    val array: Array[Int] = buffer.toArray
  }

}
