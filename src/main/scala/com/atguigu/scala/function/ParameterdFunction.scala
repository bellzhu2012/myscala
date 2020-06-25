package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 20:40
  * @Description:
  * @Modified By: lenovo
  */
object ParameterdFunction {
  def main(args: Array[String]): Unit = {
    def fun1(i : Int): Int = {
      i * 2
    }
    val a = fun1 _
    def fun2(f : Int => Int): Int = {
      f(100)
    }
//    println(fun2(fun1))
    println(fun2((x:Int)=>{x*20}))
    println(fun2(x=>x*20))
    println(fun2(_ * 20 ))

  }
}
