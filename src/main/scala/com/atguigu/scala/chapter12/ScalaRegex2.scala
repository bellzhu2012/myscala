package com.atguigu.scala.chapter12

import scala.util.matching.Regex


/**
  * @Author: lenovo
  * @Time: 2020/6/1 12:43
  * @Description:
  * @Modified By: lenovo
  */
object ScalaRegex2 {
  def main(args: Array[String]): Unit = {
    val pattern : Regex =
      """
        ^[A-Za-z0-9]{6,8}@(163|126|qq|gmail)\.(com|cn)$
      """.r
//    var list = List("23hjhj2@126.com","kjk234j@gmail.cn")
//    for (elem <- list) {
//      println(pattern.findFirstIn(elem))
//    }
    val str = "23hjhj2@126.com"
    println(pattern.findFirstIn(str))
  }
}
