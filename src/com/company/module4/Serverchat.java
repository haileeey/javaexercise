package com.company.module4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverchat {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;

        try {
            //创建ServerSocket类型的对象并提供端口号
            ss = new ServerSocket(6666);

            while(true) {
                System.out.println("等待客户端的连接请求...");
                // 当没有客户端连接时，则服务器阻塞在accept方法的调用这里
                s = ss.accept();
                System.out.println("客户端" + s.getInetAddress() + "连接成功！");
                // 每当有一个客户端连接成功，则需要启动一个新的线程为之服务
                new ServerThread(s).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
