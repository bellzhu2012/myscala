package com.atguigu.scala.day7_array

import scala.collection.mutable.ArrayBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/26 19:37
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTest2 {
  def main(args: Array[String]): Unit = {
    // mutable array
    // package : scala.collection.mutable
    //name : ArrayBuffer
    val buffer: ArrayBuffer[Int] = ArrayBuffer(1,2,3)
    println(buffer.mkString(":"))
    val buff1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    buff1.append(1)
    buff1.append(2)
    buff1.append(3)
    println(buff1.mkString("-"))
    //    buff1.insert(0,0,0)
    //    println(buff1.mkString("-"))
    //    buff1.update(0,-1)
    //    println(buff1.mkString("-"))
    //    buff1.remove(0)
    //    println(buff1.mkString(","))
    //    buff1.remove(0,2)
    //    println(buff1.mkString(","))
        val arr: Array[Int] = Array(1,2,3)
    val array: ArrayBuffer[Int] = buff1 ++ arr
    println(array.mkString(":"))

  }
}
