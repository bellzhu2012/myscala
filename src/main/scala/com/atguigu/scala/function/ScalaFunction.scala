package com.atguigu.scala.function

/**
  * @Author: lenovo
  * @Time: 2020/5/20 13:46
  * @Description:
  * @Modified By: lenovo
  */
object ScalaFunction {
  def main(args: Array[String]): Unit = {
//    def fun1():Unit={
//      println("函数体")
//    }
//    fun1()
//    def fun2(s:String): Unit={
//      println("带参无返回值")
//    }
//    fun2("hello")
//    def fun3() : String = {
//      return "hello scala"
//    }
//    val s = fun3()
//    println(s)
//    def fun4(s : String) : String = {
//      return "hello " + s
//}
//    println(fun4("scala"))
//    def fun5(name : String, age : Int):String = {
//      return s"""
//               |{"name" : "$name", "age" : $age}
//             """.stripMargin
//
//}
//    println(fun5("zhangsan",22))
    def fun6(args : Int*) : Unit = {
        print(args)
}
    fun6()
    fun6(1)
    fun6(1,2,3)
  }
}
