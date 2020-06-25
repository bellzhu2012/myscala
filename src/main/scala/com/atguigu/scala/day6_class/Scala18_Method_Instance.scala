
package com.atguigu.scala.day6_class

import jdk.nashorn.internal.objects.annotations.Property

/**
  * @Author: lenovo
  * @Time: 2020/5/25 21:58
  * @Description:
  * @Modified By: lenovo
  */
object Scala18_Method_Instance {
  def main(args: Array[String]): Unit = {
    val user = new User()
    user.User()


  }
  class User(){
    @Property
    var name : String = _
    // 编译后，显示为私有属性，提供对应的stter和getter方法
    // set方法：name_$eq方法
    // get方法：name方法
    println("user...")
    def User()={
      println("user...init...")
    }
  }

}
