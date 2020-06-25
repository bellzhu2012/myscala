package com.atguigu.scala.day6_class

/**
  * @Author: lenovo
  * @Time: 2020/5/25 21:40
  * @Description:
  * @Modified By: lenovo
  */
object Scala15_Method {
  def main(args: Array[String]): Unit = {
    val user = new User()
    // 默认方法
    // 1. java.lang.Object
    user.toString
    user.hashCode()
    // 2. scala提供的方法
    user.asInstanceOf[User]
    user.isInstanceOf[User]
    // 3. Predef的方法
    val clazz = classOf[User]

  }
  class User{
    override def equals(obj: scala.Any): Boolean = {
      if(obj.isInstanceOf[User]){
          val other = obj.asInstanceOf[User]
          this == other
      }else{
        false
      }
    }
  }

}
