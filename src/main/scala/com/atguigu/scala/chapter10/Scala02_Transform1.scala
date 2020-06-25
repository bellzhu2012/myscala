package com.atguigu.scala.chapter10

/**
  * @Author: lenovo
  * @Time: 2020/5/31 9:46
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {

    implicit def transform(i : Double)={
      i.toInt
    }
    // 编译器可以按照指定的规则进行查找，让错误的逻辑通过转换后，编译通过
    // 这个功能诚挚为隐式转换
    // 这里的隐式转换就是让编译器查找转换规则
    // 如果想要编译器可以查找到转换规则，那么需要使用特殊关键字：implicit
    // 这里的隐式转换其实就是类型的转换 A=>B

    // 隐式转换的功能：
    // 程序因为意外的原因，导致正确的逻辑出现错误
    // 扩展功能
        val i : Int = 2.0
//        val i: Int = transform(2.0)
    println(i)
  }
}
