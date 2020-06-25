package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:13
  * @Description:
  * @Modified By: lenovo
  */
object LazyFunction {
  def main(args: Array[String]): Unit = {
    def fun() : String = {
      println("lazy_function")
      "zhangsan"
    }
//    lazy val a = fun()
     val a = fun()
    println("----------------")
    println(a)
  }

}
