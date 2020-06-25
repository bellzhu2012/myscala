package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 13:15
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Match1 {
  def main(args: Array[String]): Unit = {
    // 模式匹配：规则
//    val list = List(1,"2",3,List(4,5))
    //    val result = list.flatMap(
    //      data => {
    //        data match{
    //          case a:List[_] => a
    //          case b => List(b)
    //        }
    //      }
    //    )
    //    println(result)
    val list = List(1,2,5,6,7)
    val list1 = List(1,2)
    val list2 = List(1)
//    list match{
//      case first::second::rest =>
//        //println(first + "-" + second)
//        println(rest)
//      case _ => println("something else")
//    }
    list2 match{
      case first::second::rest =>
        println(first + "-" + second)
//        println(rest)
      case _ => println("something else")
    }
    for (list <- Array(
      List(0), // 0
      List(1, 0), // 1，0
      List(0, 0, 0), // 0 ...
      List(1, 0, 0), // something else
      List(88))) {
      val result = list match{
        case List(0) => "0"
        case List(x,y) => x + "-" + y
        case List(0, _*) => "0...."
        case _ => "something else"
      }
      println(result)
    }
    def describe1(x:Any) = {
      val result = x match {
        case i : Int => "Int"
        case s : String => "String hello"
        case m : List[String] => "List"
        case c : Array[Int] => "Array[Int]"
        case something => "something else " + something
      }
      println(result)
    }
//    describe1(List(1,2,3))
    def describe2(x : Any) = {
      val result = x match {
        case 5 => "Int five"
        case "hello" => "String hello"
        case true => "Boolean true"
        case '+' => "Char +"
        case something => something
      }
      println(result)
    }
    describe2(4)
  }
}
