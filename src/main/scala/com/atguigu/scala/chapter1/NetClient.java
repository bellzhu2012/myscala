package com.atguigu.scala.chapter1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: lenovo
 * @Time: 2020/5/19 8:58
 * @Description:
 * @Modified By: lenovo
 */
public class NetClient {
    public static void main(String[] args) throws IOException {
        // 连接服务器
        Socket socket = new Socket("localhost",9999);
        OutputStream os = socket.getOutputStream();
        System.out.println("发送数据");
        os.write(10);
        os.close();
        socket.close();

    }
}
