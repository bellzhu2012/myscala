package com.atguigu.scala.flowcontrol

/**
  * @Author: lenovo
  * @Time: 2020/5/19 18:13
  * @Description:
  * @Modified By: lenovo
  */
object IfLoop {
  def main(args: Array[String]): Unit = {
    val age : Int = 50
//    if(age < 20){
    //      println("青少年")
    //    }else if (age < 40){
    //      println("中年")
    //    }else{
    //      println("老年")
    //    }
    val result = if(age < 20){
      10
    }else{
      throw new Exception()
    }
//    }else if(age < 40){
//      "中年"
//    }else{
//      "老年"
//    }
    println(result)
  }

}
