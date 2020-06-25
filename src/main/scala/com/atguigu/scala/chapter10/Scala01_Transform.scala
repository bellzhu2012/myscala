package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 9:39
  * @Description:
  * @Modified By: lenovo
  */
object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    val b : Byte = 10
    // java中基本类型的数值之间存在精度的转换和截取
    // scala中没有精度的概念，编译时会自动由编译器调用Java逻辑来进行
    // 两个类如果想要互相转换，那么必须存在关系
    // 1 父子类
    // 2 接口和实现类

    // 如果本来两个类型之间不存在关系，无法进行类型转换，但是编译器在编译时
    // 会尝试找到对应的转换方法将类型进行转换，让程序编译通过
    // 这个自动转换的过程，称为隐式转换，是由编译器完成，也称为二次编译
   val i : Int = b
    println(i)
  }
}
