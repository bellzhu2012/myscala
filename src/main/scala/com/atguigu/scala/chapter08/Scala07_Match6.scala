package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:49
  * @Description:
  * @Modified By: lenovo
  */
object Scala07_Match6 {
  def main(args: Array[String]): Unit = {
    val list1: List[Any] = List(1, 2, "3", 4)
    // 偏函数：只对部分数据进行处理的函数
    //    val pf : PartialFunction[Any, Any] = {
    //      case i : Int => i * 2
    //      case s : String => s
    //    }
    //    val newList = list1.collect(pf)
    //    println(newList)
    // 偏函数一般情况下可以使用模式匹配代替
    val newList = list1.collect {
      case i: Int => i * 2
      case s: String => s
    }
    println(newList)
  }
}
