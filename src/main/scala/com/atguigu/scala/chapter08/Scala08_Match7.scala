package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:57
  * @Description:
  * @Modified By: lenovo
  */
object Scala08_Match7 {
  def main(args: Array[String]): Unit = {
    val list : List[Any] = List(1,2,3,4,5,6,"test")
    println(list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int] + 2))
  }
}
