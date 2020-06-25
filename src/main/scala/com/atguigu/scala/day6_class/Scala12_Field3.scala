package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/26 9:15
  * @Description:
  * @Modified By: lenovo
  */
object Scala12_Field3 {
  def main(args: Array[String]): Unit = {
    class User{
      var name : String = _
      def setName(name : String) : Unit = {
        this.name = name
      }
      def getName() : String = {
        return this.name
      }
    }
  }

}
