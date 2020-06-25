package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:35
  * @Description:
  * @Modified By: lenovo
  */
object Scala27_Collection_Method55 {
  def main(args: Array[String]): Unit = {
    val dataList = List(1,2,3,4)
    // 将集合之外的数据和集合内部的数据进行聚合的操作，称为折叠
    // 集合数据的方式仍然为两两操作
    // fold棒法存在函数柯里化，有两个参数列表
    // 第一个参数列表里的参数：z:A1(zero,表示数据处理的初始值)
    // 第二个参数列表里的参数：（A1,A1）=>A1(聚合数据的逻辑)
    // fold方法在进行数据处理是，外部的数据要和集合数据类型一致
    println(dataList.fold(10)(_ - _))
    // foldLeft(z:B)(op:(B,A)=>B)
    println(dataList.foldLeft("")(_+_))
    // foldRight:reversed.foldLeft(z)(x,y)=>op(y,x)
    println(dataList.foldRight(5)(_ + _))

  }
}
