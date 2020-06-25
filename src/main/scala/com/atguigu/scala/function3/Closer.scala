package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 19:49
  * @Description:
  * @Modified By: lenovo
  */
object Closer {
  def main(args: Array[String]): Unit = {
//    def fun1()={
//      val i = 20
//      def fun11() = {
//        i * 2
//      }
//      fun11 _
//    }
//    println(fun1()())
//    def fun2(f: Int=>Int) = {
//      val i = 20
//      f(20)
//    }
//    println(fun2(_ * 2))
    def fun3(i : Int)={
      2 * i
    }
    val a = fun3 _
    println(a(10))
  }
}
