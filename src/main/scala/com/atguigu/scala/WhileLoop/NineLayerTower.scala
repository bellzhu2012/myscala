package com.atguigu.scala.WhileLoop

/**
  * @Author: lenovo
  * @Time: 2020/5/20 13:41
  * @Description:
  * @Modified By: lenovo
  */
object NineLayerTower {
  def main(args: Array[String]): Unit = {
    for(i <- 0 to 8 ){
      print(" "*(9-1-i))
      print("*"*(2*i + 1))
      println()
    }
  }

}
