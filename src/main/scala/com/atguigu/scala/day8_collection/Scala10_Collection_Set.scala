package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 21:20
  * @Description:
  * @Modified By: lenovo
  */
object Scala10_Collection_Set {
  def main(args: Array[String]): Unit = {
    // 默认集合是不可变的
    // set是特质，只能使用伴生对象的apply方法
    // 无序（插入顺序），元素不可重复
    val set: Set[Int] = Set(1,2,3,4)
    val newSet: Set[Int] = set + 5
    println(set)
    println(newSet)

  }
}
