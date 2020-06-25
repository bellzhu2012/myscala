package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 13:12
  * @Description:
  * @Modified By: lenovo
  */
object Scala01_Match1 {
  def main(args: Array[String]): Unit = {
    var a : Int = 10
    var b : Int = 20
    var operator : Char = 'b'
    var result = operator match{
        case '+' => a + b
        case '-' => a - b
        case '*' => a * b
        case '/' => a / b
//        case _ => "illegal"
    }
    println(result)
  }
}
