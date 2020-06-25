package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 22:00
  * @Description:
  * @Modified By: lenovo
  */
object AbstractControll {
  def main(args: Array[String]): Unit = {
    def fun(f : =>Int)={
      f
    }

    val i = fun{
      println("start")
      1
    }
    println(i)
  }

}
