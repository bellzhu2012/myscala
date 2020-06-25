package com.atguigu.scala.exec

/**
  * @Author: lenovo
  * @Time: 2020/5/21 11:08
  * @Description:
  * @Modified By: lenovo
  */
object Test2 {
  def main(args: Array[String]): Unit = {
    def fun2(a : Double , f : Double => Any) = {
      f(a)
    }

    println(fun2(1.1, _ + ""))


  }

}
