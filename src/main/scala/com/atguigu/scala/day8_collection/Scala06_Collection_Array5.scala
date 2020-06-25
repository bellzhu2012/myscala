package com.atguigu.scala.day8_collection

/**
  * @Author: lenovo
  * @Time: 2020/5/27 20:03
  * @Description:
  * @Modified By: lenovo
  */
object Scala06_Collection_Array5 {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1,2,3,4)
//    def fun(i:Int)={
//      println(i)
//    }
//    arr.foreach(fun)
//    arr.foreach((i:Int)=>println(i))
//    arr.foreach((i)=>println(i))
//    arr.foreach(i=>println(i))
//    arr.foreach(println(_))
//    arr.foreach(println)
//    val array: Array[Array[Int]] = Array.ofDim[Int](3,3)
//    array.foreach(list=>list.foreach(println))
    val arr1 = Array(1,2,3,4)
    val arr2 = Array(5,6,7,8)

    //    val arr3: Array[Int] = Array.concat(arr1,arr2)
    //    println(arr3.mkString("-"))
        val arr4: Array[Int] = Array.range(1,6)
    println(arr4.mkString(":"))

    val arr5: Array[Int] = Array.fill[Int](5)(-1)
    println(arr5.mkString(":"))


  }
}
