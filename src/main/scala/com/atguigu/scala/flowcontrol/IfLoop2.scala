package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 20:43
  * @Description:
  * @Modified By: lenovo
  */
object IfLoop2 {
  def main(args: Array[String]): Unit = {
    val age = 20
    val result = if(age <15){
      "青少年"
    }else if (age<35){
      "青年"
    }else if(age<50){
      "中年"
    } else{
      "老年"
    }
    println(result)
  }

}
