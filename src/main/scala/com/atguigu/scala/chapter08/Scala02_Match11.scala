package com.atguigu.scala.chapter08

/**
  * @Author: lenovo
  * @Time: 2020/5/30 20:25
  * @Description:
  * @Modified By: lenovo
  */
object Scala02_Match11 {
  def main(args: Array[String]): Unit = {
    // 模式匹配
//    val list = List(1,"2",3,List(4,5))
//    val newList = list.flatMap(
//      element => {
//        element match {
//          case a: List[Int] => a
//          case b => List(b)
//        }
//
//      })
//    println(newList)
//    val list : List[Int] = List(1,2,5,6,7)
//    val list1 : List[Int] = List(1,2)
//    val list2 : List[Int] = List(1)
//    list1 match {
//      case first :: second :: rest => println(first + ":" + second)
//      case _ => println("something else")
//    }
//    for( list <- Array(
//      List(0), // 0
//      List(1, 0), // 1，0
//      List(0, 0, 0), // 0 ...
//      List(1, 0, 0), // something else
//      List(88))){
//      val result = list match {
//        case List(0) => "0"
//        case List(x, y) => x + "," + y
//        case List(0, _*) => "0..."
//        case _ => "something else"
//      }
//      println(result)
//    }

//    for (arr <- Array(
    //      Array(0), // 0
    //      Array(1, 0), // 1，0
    //      Array(0, 1, 0), // 以0开头的数组
    //      Array(1, 1, 0), // something else
    //      Array(1, 1, 0, 1),// something else
    //      Array("hello", 90))) { // hello，90
    //
    //      val result = arr match {
    //        case Array(0) => "0"
    //        case Array(x,y) => x + "," + y
    //        case Array(0, _*) => "以0开头的数组"
    //        case _ => "something else"
    //      }
    //      println(result)
    //
    //      }

    def describe(x : Any) = {
      val result = x match {
        case i : Int => "Int"
        case s : String => "String hello"
        case l : List[_] => "List"
        case a : Array[Int] => "Array[Int]"
        case something => "something else" + something
      }
      println(result)
    }
    //    describe("abc")
    //    describe(List(1,2,3))
    //    describe(Array(1,2))

    def describe1(x : Any)={
      val result = x match{
        case 5 => "Int five"
        case "hello" => "String hello"
        case true => "Boolean true"
        case '+' => "Char +"
        case _ => "else"
      }
      println(result)
    }
    describe1(5)
    describe1("hello")
    describe1("false")
    describe1('+')

  }
}
