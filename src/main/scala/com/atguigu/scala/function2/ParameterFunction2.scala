package com.atguigu.scala.function2

/**
  * @Author: lenovo
  * @Time: 2020/5/20 21:56
  * @Description:
  * @Modified By: lenovo
  */
object ParameterFunction2 {
  def main(args: Array[String]): Unit = {
//    def fun2(i : Int) : Int = {
//      i * 2
//    }
//    def fun22 ( f : Int => Int ) : Int = {
//      f(10)
//    }
//    println(fun22(fun2))
    def fun3(i : Int) : Int = {
      i * 2
    }
    def fun33() = {
      fun3 _
    }
    println(fun33()(20))
  }
}
