package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:10
  * @Description:
  * @Modified By: lenovo
  */
object RangeForLoop {
  def main(args: Array[String]): Unit = {
//    for (i <- Range(1,5)){
//      // 底层就是 1 until 5
//      println("i = " + i)
//    }
//    for (i <- Range(1,5,2)){
//      println("i = " + i)
//    }
    for (i <- Range(5,1,-1)){
      println("i = " + i)
    }
  }

}
