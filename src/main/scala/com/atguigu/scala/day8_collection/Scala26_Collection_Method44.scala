package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:21
  * @Description:
  * @Modified By: lenovo
  */
object Scala26_Collection_Method44 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6)
    // reduce: 简化规约
    // reduce 的参数： op:(A1,A1)=>A1
    println(list.reduce(_ + _))
    println(list.reduce(_ - _))
    // reduceLeft和reduce是一样的

    // reduceRight的参数： op:(Int, B) =>B
    // reversed.reduceLeft[B](x,y) =>op(y,x)
//    如何判断计算：left--从左边加括号；right--从右边加括号
    println(list.reduceRight(_ - _))
  }
}
