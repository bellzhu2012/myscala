package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/30 8:13
  * @Description:
  * @Modified By: lenovo
  */
object Scala30_Collection_Method88 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    println(list.scan(0)(_ + _))
    println(list.scanLeft(0)(_ + _))
    println(list.scanRight(0)(_ + _))
  }
}
