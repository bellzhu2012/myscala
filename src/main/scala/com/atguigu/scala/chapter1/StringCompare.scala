package com.atguigu.scala.chapter1

/**
  * @Author: lenovo
  * @Time: 2020/5/19 10:56
  * @Description:
  * @Modified By: lenovo
  */
object StringCompare {
  def main(args: Array[String]): Unit = {
    val a :String = new String("abc")
    val b :String = new String("abc")

    println(a == b)
    println(a.equals(b))
    println(a eq b )
  }

}
