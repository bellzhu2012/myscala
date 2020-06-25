package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:04
  * @Description:
  * @Modified By: lenovo
  */
object Curry {
  def main(args: Array[String]): Unit = {
    def fun(i : Int)(op: => Unit): Unit ={
      println("第" + i+ ":start!")
      op
      println("第" + i+ ":start!")
    }
    fun(1){
      println("hello scala")
    }
  }

}
