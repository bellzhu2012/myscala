package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 11:25
  * @Description:
  * @Modified By: lenovo
  */
object Scala26_Collection_Method3 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
//    val result: Int = list.reduce((a:Int, b:Int)=>{a+b})
//    println(result)
//    val result2 = list.reduceLeft(_+_)
//    println(result2)
//    val result3 = list.reduceRight(_+_)
//    println(result3)
    // reduceLeft:从左边起加括号
    // reduceRight：从右边起加括号
    val result1 = list.reduceLeft(_-_)
    val result2 = list.reduceRight(_-_)
    println(result1)
    println(result2)

  }
}
