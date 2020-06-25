package com.atguigu.scala.day8_collection

import scala.collection.mutable.ArrayBuffer

/**
  * @Author: lenovo
  * @Time: 2020/5/27 19:58
  * @Description:
  * @Modified By: lenovo
  */
object Scala04_Collectiion_Array3 {
  def main(args: Array[String]): Unit = {
    val arr: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)
    arr.append(5)
    arr.append(6)
    arr.insert(0,-1,0)
    arr.update(7,7)
    arr.remove(0,2)

    println(arr.mkString("-"))
  }
}
