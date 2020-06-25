package com.atguigu.scala.day8_collection

import scala.collection.immutable

/**
  * @Author: lenovo
  * @Time: 2020/5/27 20:38
  * @Description:
  * @Modified By: lenovo
  */
object Scala08_Collection_Seq1 {
  def main(args: Array[String]): Unit = {
    // 空集合 Nil
    val nil: List[Nothing] = Nil
    println(Nil)
    //空集合一般用于增加数据
    val list1:List[Int] = 1::2::3::Nil
    println(list1)
    val list2: List[Any] = 4::5::list1::Nil
    println(list2)
    // 将一个List拆分成一个一个个体来使用，称之为片平化
    val list3: List[Int] = 4::5::list1:::Nil
    println(list3)
  }
}
