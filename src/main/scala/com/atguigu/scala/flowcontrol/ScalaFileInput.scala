package com.atguigu.scala.flowcontrol

import scala.io.Source

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:30
  * @Description:
  * @Modified By: lenovo
  */
object ScalaFileInput {
  def main(args: Array[String]): Unit = {
    // 返回一个迭代器
    val iterator = Source.fromFile("input/hello.txt").getLines()
    while(iterator.hasNext){
      val str = iterator.next()
      println(str)
    }

  }

}
