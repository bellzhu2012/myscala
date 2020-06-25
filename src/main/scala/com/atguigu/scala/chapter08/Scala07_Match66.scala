package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 21:54
  * @Description:
  * @Modified By: lenovo
  */
object Scala07_Match66 {
  def main(args: Array[String]): Unit = {
    val list1:List[Any] = List(1,2,"3",4)
//    val pf : PartialFunction[Any,Any] = {
//      case i : Int => i * 2
//      case s : String => s
//    }
//    println(list1.collect(pf))
    val newList = list1.collect {
      case i: Int => i + 1
      case s: String => s
    }
    println(newList)
  }
}
