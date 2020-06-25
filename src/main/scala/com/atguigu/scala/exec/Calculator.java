package com.atguigu.scala.exec;

/**
 * @Author: lenovo
 * @Time: 2020/5/21 11:19
 * @Description:
 * @Modified By: lenovo
 */
enum  Calculator {
    ADD(1), SUB(2), MUL(3), DIV(4);
    private int number;
    private Calculator(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
