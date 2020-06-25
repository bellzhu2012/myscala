package com.atguigu.scala.chapter1


object DataType {
  def main(args: Array[String]): Unit = {
    // 任意数据类型
    val a : Byte = 1
    val b : Char = 'a'
    val c : Short = 20
    val d : Int = 1000
    val e : Long = 230942L
    val f : Float = 11.11f
    val g : Double = 343.12312
    val flag : Boolean = false
    val h : Unit = ()
    // 任意引用类型
    val array1 = new Array[String](10)

    val aa = 10
    println(aa)
    val dd = 1.1
    println(dd)
    val s = null
    println(s)
  }
}
