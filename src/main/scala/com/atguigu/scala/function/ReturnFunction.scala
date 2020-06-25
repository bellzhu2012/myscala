package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 20:54
  * @Description:
  * @Modified By: lenovo
  */
object ReturnFunction {
  def main(args: Array[String]): Unit = {
    def fun(i : Int) : Int = {
      i * 2
    }
    val a = fun _
    def fun2() = {
      a
    }
    println(fun2()(10))
  }

}
