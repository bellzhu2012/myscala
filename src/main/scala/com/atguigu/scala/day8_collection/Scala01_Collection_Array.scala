package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 19:48
  * @Description:
  * @Modified By: lenovo
  */
object Scala01_Collection_Array {
  def main(args: Array[String]): Unit = {
    val array = new Array[String](5)
    array(0) = "zhangsan0"
    array(1) = "zhangsan1"
    array(2) = "zhangsan2"
    array(3) = "zhangsan3"
    array(4) = "zhangsan4"

    array.foreach(println)

    println(array.mkString("-"))

  }
}
