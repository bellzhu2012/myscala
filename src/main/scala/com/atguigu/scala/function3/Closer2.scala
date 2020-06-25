package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:19
  * @Description:
  * @Modified By: lenovo
  */
object Closer2 {
  def main(args: Array[String]): Unit = {
//    def fun1(a : Int)={
//          def fun11() = {
//            a * 2
//          }
//          fun11 _
//        }
//        println(fun1(10)())
//    def fun2(a : Int)={
//      ()=>a * 2
//    }
//    println(fun2(10)())
//    def fun3(a : Int)={
//      a * 2
//    }
//    val b = fun3 _
//    println(b(10))
    def fun4(f: (Int)=> Int)={
  f(10)
}
    println(fun4(_ * 2))
  }

}
