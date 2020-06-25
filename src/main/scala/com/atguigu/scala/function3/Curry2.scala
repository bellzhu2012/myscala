package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:50
  * @Description:
  * @Modified By: lenovo
  */
object Curry2 {
  def main(args: Array[String]): Unit = {
    def fun(message : String)(f : => Unit) = {
      println(message + "开始传递")
      f
      println(message + "传递完成")
    }
    fun("数据"){
      println("正在传输！！")
    }
  }

}
