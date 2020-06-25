package com.atguigu.scala.exec

/**
  * @Author: lenovo
  * @Time: 2020/5/22 9:04
  * @Description:
  * @Modified By: lenovo
  */
object Scala_Function_Test {
  def main(args: Array[String]): Unit = {
    // 定义一个函数，传入任意的数字A通过转换，可以得到它的2倍
    def transform1(num : Double) = {
      num * 2
    }
//    println(transform1(2))

    // 定义一个函数，可以将数字，转换为任意的数据
    def transform2(num : Double, f:(Double)=>Any):Any={
      f(num)
    }

//    println(transform2(5, (d: Double) => {
//      d * d
//    }))
    // 如果函数调用：test(10,20,c) 的计算结果由参数C决定
    def test(x : Int, y : Int, f:(Int, Int)=>Any):Any = {
      f(x,y)
}
//    println(test(10,20,(x,y)=>x+y))
//    println(test(10,20, _+_))
    def filter(s:String, f:(String)=>Boolean):String = {
      val words = s.split(" ")
      val result = ""
      for( word <- words){
        if (result != null || result.length != 0){
          result + ","
        }
        if(f(word)){
           result + word
        }
      }
      result
}
    println(filter("hello world spark scala",_.startsWith("s")))
  }
}
