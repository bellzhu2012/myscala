package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:11
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Transform11 {
  def main(args: Array[String]): Unit = {
    implicit def transform(i : Double)={
      i.toInt
    }
    var i : Int = 2.0
    println(i)
  }
}
