package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 21:26
  * @Description:
  * @Modified By: lenovo
  */
object Scala26_Collection_Method444 {
  def main(args: Array[String]): Unit = {
    var list = List(1,2,3,4,5,6)
    // reduce:简化规约
    // reduce参数：op:(A1,A1)=>A1
    println(list.reduce(_ - _))
    println(list.reduce(_ + _))
    // reduce底层调用的就是reduceLeft
    // redeceLeft参数：op:(B,Int)=>B
    println(list.reduceLeft(_ + _))
    println(list.reduceLeft(_ - _))
    // reduceRight参数：op:(Int,B)=>B
    // reversed.reduceLeft[B](x,y)=>op(y,x)
    //如何判断计算方式
    // ruduceLeft：从左侧加括号
    // reduceRight：从右侧加括号
  }
}
