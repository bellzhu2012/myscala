package com.atguigu.scala.day7_array

import scala.collection.mutable.ArrayBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:16
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTest22 {
  def main(args: Array[String]): Unit = {
    // 创建可变数组
    val buffer1 = new ArrayBuffer[Int]()
    buffer1.append(1)
    buffer1.append(2)
    buffer1.append(3)
    buffer1.remove(0,2)
    buffer1.update(0,10)
    buffer1.insert(0,7,8,9)
    val buffer2 = buffer1 ++ Array(11,12,13,14)
    println(buffer1.mkString(":"))
    println(buffer2.mkString(":"))

  }

}
