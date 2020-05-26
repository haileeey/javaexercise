package com.company.module4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.net.ServerSocket;


public class Work4client {
    public static void main(String[] args) {
        Scanner sc = null;
        Socket s;
        String namestring;
        String passwordstr;
        ObjectInputStream oi = null;
        ObjectOutputStream oos = null;


        try {
            s = new Socket("127.0.0.1", 8888);
            System.out.println("请输入用户名和密码 空格隔开");
            sc = new Scanner(System.in);
            namestring = sc.next();
            passwordstr = sc.next();
            UserMessage u1 = new UserMessage(new User1(namestring,passwordstr),"check");
            oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(u1);
            System.out.println("正在核对中...");
            Thread.sleep(3000);
            oi = new ObjectInputStream(s.getInputStream());
            u1 = (UserMessage) oi.readObject();
            if(u1.getStatus().equals("success")){
                System.out.println("登陆成功");
            }else{
                System.out.println("登录失败");
            }

        } catch (NullPointerException |IOException | InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                oi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }




}
