package com.atguigu.scala

/**
  * @Author: lenovo
  * @Time: 2020/5/31 11:33
  * @Description:
  * @Modified By: lenovo
  */
package object chapter10 {
  implicit class UserExt(user:User){
    def updateUser()={
      println("update user...")
    }
  }
}
