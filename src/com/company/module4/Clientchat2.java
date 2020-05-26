package com.company.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Clientchat2 {
    public static void main(String[] args) {
        Socket s;
        PrintStream ps = null;
        Scanner sc = null;
        BufferedReader br = null;
        String str1 = null;
        String str2 = null;
        boolean flag;

        try {

            s = new Socket("127.0.0.1", 6666);

            // 使用输入输出流进行通信
            sc = new Scanner(System.in);
            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while(true) {
                flag = true;
                System.out.println("请输入要发送的内容：");
                str1 = sc.next();

                    ps.println(str1);
                    System.out.println("客户端发送内容成功！");
                    // 当发送的数据内容为"bye"时，则聊天结束
                    if ("bye".equalsIgnoreCase(str1)) {
                        System.out.println("聊天结束！");
                        break;
                    }
                    // 实现接收服务器发来的字符串内容并打印
                while(true){
                    str2 = br.readLine();
                    if(str2!=null){
                        System.out.println("服务器回发的消息是：" + str2);
                    }else{
                        break;
                    }
                }
                System.out.println("aaaaa");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭Socket并释放有关的资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps) {
                ps.close();
            }
            if (null != sc) {
                sc.close();
            }

        }
    }
}
