package com.atguigu.scala.function2

/**
  * @Author: lenovo
  * @Time: 2020/5/20 21:11
  * @Description:
  * @Modified By: lenovo
  */
object ScalaFunction {
  def main(args: Array[String]): Unit = {
//    def fun1() : Unit = {
//      println("函数体")
//    }
//    fun1()
//    def fun2() : String = {
//      return "hello scala"
//}
//    println(fun2)
//    def fun3(name : String) : Unit = {
//      println(name)
//}
//    fun3("zhangsan")
//    def fun4(name : String) : String = {
//      return name
//}
//
//    println(fun4("hotel California"))
//    def fun5(hello : String, name : String) : Unit = {
//      println(hello + " " + name)
//}
//    fun5("hello", "Chikago")
//    def fun6(hello : String, name : String) : String = {
//      return hello + " " + name
//}
//
//    println(fun6("hello", "scala"))
//    def fun7(names : String*) : Unit = {
//      println(names)
//}
//    fun7()
//    fun7("zhangsan")
//    fun7("zhangsan", "lisi")
    def fun8(name : String, names : String*) : Unit = {
      println(name)
      println(names)
}
    fun8("zhangsan")
    fun8("zhangsan", "lisi")
    fun8("zhangsan", "lisi", "wangwu")
  }

}
