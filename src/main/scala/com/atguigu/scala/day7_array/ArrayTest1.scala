package com.atguigu.scala.day7_array

/**
  * @Author: lenovo
  * @Time: 2020/5/26 19:07
  * @Description:
  * @Modified By: lenovo
  */
object ArrayTest1 {
  def main(args: Array[String]): Unit = {
    // immutable array
    // package : scala
    // name: Array
    // 1. 创建数组方式
    // 1.1 new的方式
    val arr1: Array[String] = new Array[String](5)
    // 1.2 调用apply方法
    val arr2 : Array[Int] = Array(1,2,3)
    // 2. 赋值
    // 2.1 使用索引赋值
    arr1(0) = "zhangsan"
    arr1(1) = "lisi"
    arr1(2) = "wangwu"
    arr1(3) = "liuda"
    arr1(4) = "scala"
    // 2.2 使用方法赋值
    arr2.update(1,5)

    // 3.打印数组
//    val str = arr1.mkString(",")
//    println(str)
    println(arr2.mkString("-"))

    // 4 不可变数组的特性：增加元素会导致产生新的数组
    val arr3: Array[Int] = arr2 :+ 4
    println(arr3.mkString(":")) // 1:5:3:4
    val arr4: Array[Int] = 0 +: arr2
    println(arr4.mkString(" | ")) // 0 | 1 | 5 | 3
//    val arr5: Array[Int] = arr3 ++ arr4
//    val arr6: Array[Int] = arr3 ++: arr4
    val arr5: Array[Int] =  arr4 ++ arr3
    val arr6: Array[Int] =  arr4 ++: arr3
    println(arr5.mkString(" - "))
    println(arr6.mkString(" - "))
    // 5 遍历数组
    for( i <- arr6 ){
      println(i)
    }
    println(arr6.length)
  }
}
