package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 14:37
  * @Description:
  * @Modified By: lenovo
  */
object Collection_Method3 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3,4,5)
    def transform(i:Int)={
      i * 2
    }
    val newList = list.map(transform)
//    val newList: List[Int] = list.map(_ * 2)
    println(newList)
  }

}
