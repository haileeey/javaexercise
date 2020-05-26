package com.company.module4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Work4server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        //BufferedReader br = null;
        ObjectInputStream oi = null;
        ObjectOutputStream oos = null;
        UserMessage u1 = null;
        try {
            ss = new ServerSocket(8888);
            System.out.println("等待客户输入中");
            s = ss.accept();
            oi = new ObjectInputStream(s.getInputStream());
            u1 = (UserMessage) oi.readObject();
            if("admin".equals(u1.getU1().getName()) &&"123456".equals(u1.getU1().getPassword())){
                u1.setStatus("success");
            }else{
                u1.setStatus("fail");
            }
            oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(u1);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
