package com.atguigu.scala.day7_array

/**
  * @Author: lenovo
  * @Time: 2020/5/26 21:10
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTest11 {
  def main(args: Array[String]): Unit = {
    // 创建方式
    val arr1: Array[Int] = new Array[Int](3)
    val arr2: Array[Int] = Array(4,5,6)
//    println(arr1.length)
//    println(arr2.length)
    // 使用
    arr1(0) = 1
    arr1(1) = 2
    arr1(2) = 3
    arr1.update(0,0)
    // 新增元素
    val arr3: Array[Int] = arr1 :+ 4
    // 遍历
    for( i <- arr2  ){
      println(i)
    }
    //打印
    println(arr1.mkString("-"))
    println(arr2.mkString(":"))
    println(arr3.mkString(","))
  }
}
