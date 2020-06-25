package com.atguigu.scala.function3

/**
  * @Author: lenovo
  * @Time: 2020/5/22 20:08
  * @Description:
  * @Modified By: lenovo
  */
object Recursion {
  def main(args: Array[String]): Unit = {
//    def fun(i : Int):Int = {
    //      if (i <= 1){
    //        1
    //      }else{
    //        i * fun(i - 1)
    //      }
    //    }
    //    print(fun(5))
    def fun():Unit = {
      fun()
      println("hello scala")
    }
    fun()
  }

}
