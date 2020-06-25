package com.atguigu.scala.chapter1;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: lenovo
 * @Time: 2020/5/19 9:13
 * @Description:
 * @Modified By: lenovo
 */
public class ObjectClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9999);
        OutputStream os = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
        User user = new User();
        objectOutputStream.writeObject(user);
        os.close();
        objectOutputStream.close();
        socket.close();

    }
}
