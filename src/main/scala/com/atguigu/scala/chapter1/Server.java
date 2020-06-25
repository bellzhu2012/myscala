package com.atguigu.scala.chapter1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: lenovo
 * @Time: 2020/5/19 8:59
 * @Description:
 * @Modified By: lenovo
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 服务器
        ServerSocket socket = new ServerSocket(9999);
        System.out.println("开始接受数据");
        Socket client = socket.accept();
        InputStream is = client.getInputStream();
        int read = is.read();
        System.out.println(read);
        is.close();
        client.close();
        socket.close();



    }
}
