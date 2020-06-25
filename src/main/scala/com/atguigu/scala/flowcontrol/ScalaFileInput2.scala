package com.atguigu.scala.flowcontrol

import scala.io.Source

/**
  * @Author: lenovo
  * @Time: 2020/5/19 20:28
  * @Description:
  * @Modified By: lenovo
  */
object ScalaFileInput2 {
  def main(args: Array[String]): Unit = {
    val iterator = Source.fromFile("input/hello.txt").getLines()
    while(iterator.hasNext){
      println(iterator.next())
    }
  }

}
