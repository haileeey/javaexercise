package com.company.module4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerThread extends Thread{
    private Socket s;
    public static List<String> arry = new ArrayList<>();

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;
        String s1= null;

        try {

            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());

            while(true) {

                s1 = br.readLine();
                arry.add(s1);
                InetAddress inetAddress = s.getInetAddress();
                for(String s2 : arry){
                    System.out.println("客户端" + inetAddress + "发来的字符串内容是：" + s2);
                }
                // 当客户端发来的内容为"bye"时，则聊天结束
                if ("bye".equalsIgnoreCase(s1)) {
                    System.out.println("客户端" + inetAddress + "已下线！");
                    break;
                }
                for(String s3 :arry){
                    ps.println("客户端" + inetAddress + "发来的字符串内容是：" + s3);
                }



            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ps) {
                ps.close();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

