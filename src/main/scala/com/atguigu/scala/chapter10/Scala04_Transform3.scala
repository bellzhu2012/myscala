package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 10:23
  * @Description:
  * @Modified By: lenovo
  */
object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {
    //OCP
    // implicit 修饰函数参数的时候，这个参数所在的参数列表只能有一个参数 =>柯里化
    def regUser(name:String)(implicit password:String = "000000"): Unit ={
      println(s"注册用户：$name,默认密码：$password")
    }
    // 如果使用隐式参数进行默认处理，那么调用函数时，不需要使用小括号
    // 如果使用小括号，就表示不使用隐式变量
    implicit val password = "888888"
    regUser("lisi")()
    val s: String = "abc"
    s // String => char[]
    println(s(0)) // =>char(0)
    // StringOps其实是字符串的一个辅助类，增加功能，靠隐式转换实现
    // implicit def augmentString(x : Predef.String) : scala.collection.immutable.StringOps = { new StringOps(x) }
  }
}
