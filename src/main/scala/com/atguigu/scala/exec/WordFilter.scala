package com.atguigu.scala.exec

/**
  * @Author: lenovo
  * @Time: 2020/5/21 11:28
  * @Description:
  * @Modified By: lenovo
  */
object WordFilter {
  def main(args: Array[String]): Unit = {
    def fun4(line : String)={
      val words = line.split(" ")
      val builder = new StringBuilder()
      val iterator = words.iterator
      while(iterator.hasNext){
        val word = iterator.next()
        if(word.startsWith("s")){
            if(builder.length != 0){
                builder.append(",")
            }
            builder.append(word)
        }
      }
      builder.toString()
    }
    val line = "hello world scala spark"
    println(fun4(line))
  }

}
