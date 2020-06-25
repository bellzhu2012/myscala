package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 20:50
  * @Description:
  * @Modified By: lenovo
  */
object Scala03_Match22 {
  def main(args: Array[String]): Unit = {
    for (tuple <- Array(
      (0, 1), // 0 ...
      (1, 0), // 10
      (1, 1), // 1 1
      (1, 0, 2))){
      val result = tuple match{
        case (0, _) => "0..."
        case (y, 0) => "" + y + "0"
        case (a,b) => "" + a + "" + b
        case _ => "something else"
      }
      println(result)
    }
  }
}
