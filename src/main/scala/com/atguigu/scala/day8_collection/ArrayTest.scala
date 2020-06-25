package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 9:30
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    val arr1: Array[Int] = Array.range(1,5)
    println(arr1.mkString(":"))
    val arr2: Array[Int] = Array.fill[Int](5)(-1)
    println(arr2.mkString("-"))
    val array: Array[Array[Int]] = Array.ofDim[Int](3,3)
    array.foreach(arr=>arr.foreach(println))

  }
}
