package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:01
  * @Description:
  * @Modified By: lenovo
  */
object ToForLoop {
  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 5){
//      println("i = " + i)
//    }
//    for (i <- 1 to 5 by 2){
//      println("i = " + i)
//    }
    for(i <- 5 to 1 by -1){
      println(i)
    }
  }

}
