package com.atguigu.scala.chapter1

/**
  * @Author: lenovo
  * @Time: 2020/5/19 10:19
  * @Description:
  * @Modified By: lenovo
  */
object AutoTypeTransform {
  def main(args: Array[String]): Unit = {
    val a : Byte = 1
    val b : Short = a
    val c : Int = b
    println(c)

  }
}
