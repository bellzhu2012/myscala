package com.atguigu.scala.chapter1


object FirstScala {
    def main(args : Array[String]) : Unit = {
        println("start");
        println(FirstScala.test());
        println("end");
    }

    def test() : String = {
        return "test";
    }
}
