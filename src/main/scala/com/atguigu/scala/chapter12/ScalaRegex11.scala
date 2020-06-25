package com.atguigu.scala.chapter12

import scala.util.matching.Regex

/**
  * @Author: lenovo
  * @Time: 2020/6/1 12:40
  * @Description:
  * @Modified By: lenovo
  */
object ScalaRegex11 {
  def main(args: Array[String]): Unit = {
    val pattern: Regex = "(s|S)cala".r
    val str = "Scala is scalable language"
    println(pattern.findFirstIn(str))
    pattern.findAllIn(str).foreach(println)
  }
}
