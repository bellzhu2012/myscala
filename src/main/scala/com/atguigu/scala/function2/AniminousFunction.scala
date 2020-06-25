package com.atguigu.scala.function2

/**
  * @Author: lenovo
  * @Time: 2020/5/20 22:01
  * @Description:
  * @Modified By: lenovo
  */
object AniminousFunction {
  def main(args: Array[String]): Unit = {
    def fun4(f : Int => Int) : Int = {
      f(10)
    }
    println(fun4((x:Int)=>{x*20}))
    println(fun4((x)=>{x*20}))
    println(fun4((x)=>x*20))
    println(fun4(x=>x*20))
    println(fun4(_ * 20))

    for( i <- 1 to 2){
        println("hello")
    }
    for( i <- 2 until 5){
        println("*"*i)
    }
    for( i <- Range(1, 5)){

    }

  }


}
