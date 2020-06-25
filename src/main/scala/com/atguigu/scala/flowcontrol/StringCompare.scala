package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 20:41
  * @Description:
  * @Modified By: lenovo
  */
object StringCompare {
  def main(args: Array[String]): Unit = {
    val a = new String("abc")
    val b = new String("abc")
    println(a == b)
    println(a.equals(b))
    println(a eq b)
  }

}
