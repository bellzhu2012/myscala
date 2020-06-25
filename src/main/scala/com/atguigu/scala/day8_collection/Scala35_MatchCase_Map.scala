package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/30 11:17
  * @Description:
  * @Modified By: lenovo
  */
object Scala35_MatchCase_Map {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->("a",1),"b"->("b",2))
    map.foreach{
      case (province,(item, count))=>{
        println(count)
      }
    }
    val Array(first, second, _*) = Array(1,2,3,4,5)
    println(first)
    println(second)

  }
}
