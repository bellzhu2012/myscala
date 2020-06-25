package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 20:21
  * @Description:
  * @Modified By: lenovo
  */
object EconomicFunction {
  def main(args: Array[String]): Unit = {

//    val a = () => {"zhangsan"}
//    println(a)

    def fun() = "lisi"
    val a = fun
    val b = fun _
//    val b :()=>String = fun
    println(a)
//    println(a())
    println(b)
    println(b())
  }
}
