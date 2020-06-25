package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:07
  * @Description:
  * @Modified By: lenovo
  */
object UntilForLoop {
  def main(args: Array[String]): Unit = {
//    for (i <- 1 until 5){
//      println("i = " + i)
//    }
//    for (i <- 1 until 5 by 2){
//      println("i = " + i)
//    }
    for (i <- 5 until 1 by -1){
      println("i = " + i)
    }
  }

}
