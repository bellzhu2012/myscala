package com.atguigu.scala.exec

/**
  * @Author: lenovo
  * @Time: 2020/5/21 11:04
  * @Description:
  * @Modified By: lenovo
  */
object Test1 {
  def main(args: Array[String]): Unit = {
    def fun1 (i : Double) = {
      i * 2
    }

    println(fun1(1))
    println(fun1(2.0))
  }

}
