package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/29 13:04
  * @Description:
  * @Modified By: lenovo
  */
object Scala24_Collection_SortWith {
  def main(args: Array[String]): Unit = {
    val list: List[(Int, String)] = List((30,"zhangsan"),(30,"lisi"),(50,"liuda"))
    def fun(left:(Int, String), right:(Int,String)) : Boolean = {
      if(left._1 > right._1){
          true
      }else if(left._1 == right._1){
          left._2 < right._2
      }else{
        false
      }
    }
    val newList = list.sortWith(fun)
    println(newList)
  }
}
