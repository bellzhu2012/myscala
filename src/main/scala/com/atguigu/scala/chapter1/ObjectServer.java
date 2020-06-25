package com.atguigu.scala.chapter1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: lenovo
 * @Time: 2020/5/19 9:13
 * @Description:
 * @Modified By: lenovo
 */
public class ObjectServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(9999);
        Socket client = server.accept();
        InputStream inputStream = client.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        User user =(User) ois.readObject();
        System.out.println(user);
        inputStream.close();
        ois.close();
        client.close();
        server.close();

    }
}
