package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/20 13:33
  * @Description:
  * @Modified By: lenovo
  */
object LoopControl {
  def main(args: Array[String]): Unit = {
//    for (i <- Range(1,5) if i != 3){
//      println(i)
//    }
    for (i <- 1 to 5 if i != 2){
      println(i)
    }
  }

}
