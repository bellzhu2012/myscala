package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/30 9:24
  * @Description:
  * @Modified By: lenovo
  */
object Scala34_MatchCase1 {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var operator : Char = 'd'
    val result = operator match {
//      case _ => "illegal"
      case '+' => a + b
      case '-' => a - b
    }
    println(result)
  }
}
