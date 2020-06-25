package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:56
  * @Description:
  * @Modified By: lenovo
  */
object Scala07_Transform6 {
  def main(args: Array[String]): Unit = {
    def transform(implicit d : Double) = {
      d.toInt
    }
    implicit val dd : Double = 2.0
    println(transform(10))
  }
}
