package com.atguigu.scala.function2

import com.atguigu.summer.framework.core.Application

/**
  * @Author: lenovo
  * @Time: 2020/5/22 15:55
  * @Description:
  * @Modified By: lenovo
  */
object JDBCFrameWork extends Application{
  def main(args: Array[String]): Unit = {
    start("jdbc"){
      println("执行业务逻辑")
    }
  }
}
