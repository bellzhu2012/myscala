package com.atguigu.scala.day7_array

import scala.collection.mutable.Buffer

/**
  * @Author: lenovo
  * @Time: 2020/5/26 19:45
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTransfer {
  def main(args: Array[String]): Unit = {
    val array = new Array[Int](3)
    val buffer: Buffer[Int] = array.toBuffer
    val arr = buffer.toArray

  }
}
