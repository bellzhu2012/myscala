package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:53
  * @Description:
  * @Modified By: lenovo
  */
object LazyFunction2 {
  def main(args: Array[String]): Unit = {
    def fun()={
      println("函数调用！！")
      "zhagnsna"
    }
    lazy val a = fun()
    println("____________")
    println(a)
  }

}
