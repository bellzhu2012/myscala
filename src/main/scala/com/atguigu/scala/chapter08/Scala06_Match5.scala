package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:39
  * @Description:
  * @Modified By: lenovo
  */
object Scala06_Match5 {
  def main(args: Array[String]): Unit = {
    val Array(first, second, _*) = Array(1,7,2,9)
    val Person(name, age) = Person("zhgnsan",20)
    println(name)
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ( (k, 0) <- map ) {
      println(k)
    }

  }
  case class Person(name: String,age:Int)
}
