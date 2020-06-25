package com.atguigu.scala.day8_collection

import scala.collection.mutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 21:24
  * @Description:
  * @Modified By: lenovo
  */
object Scala11_Collection_Set1 {
  def main(args: Array[String]): Unit = {
    // 可变set，包：scala.collection.mutable.Set
    val set: mutable.Set[Int] = mutable.Set(1,2,4)
    // 产生新的集合
    val newSet: mutable.Set[Int] = set + 5
    // 不产生新集合
    val oldSet: mutable.Set[Int] = set += 5
    println(newSet eq set)
    println(oldSet eq set)

    // 修改集合
    // 向集合中添加元素
    set.update(3,true)
    println(set)
    // 从集合中删除数据
    set.update(2,false)
    println(set)
    // 删除数据
    set.remove(3)
    val set1 = set - 4 // 创建新集合
    val set2 = set -= 1 // 修改旧集合
    println(set)
    println(set1)
    println(set2)
  }
}
