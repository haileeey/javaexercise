package com.company.module3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class WORK4 {
    public static void main(String[] args) {
        int studentid = 0;
        int age =0;
        String name = null;
        Students sd1 = new Students();
        Scanner sc1 = new Scanner(System.in);
        int select;
        Collection<Students> c1 = new ArrayList<>();

        while(true){
            System.out.println("请选择功能 输入对应数字");
            System.out.println("1-增加信息 2-删除信息 3-修改信息 4-查找 5-遍历 其他数字退出");
            select = sc1.nextInt();
            switch (select){
                case 1:
                    System.out.println("请输入学号 姓名 年龄");
                    studentid = sc1.nextInt();
                    name = sc1.next();
                    age = sc1.nextInt();
                    Students sd2 = new Students(studentid,name,age);
                    c1.add(sd2);
                    System.out.println("添加成功！");
                    break;
                case 2:
                    System.out.println("输入想删除信息的学生姓名：");
                    name = sc1.next();
                    sd1.setName(name);
                    c1.remove(sd1);
                    System.out.println("删除成功");
                    break;
                case 3:
                    System.out.println("输入想修改的学生姓名：");
                    name = sc1.next();
                    sd1.setName(name);
                    c1.remove(sd1);
                    System.out.println("请输入新的学号 姓名 年龄");
                    studentid = sc1.nextInt();
                    name = sc1.next();
                    age = sc1.nextInt();
                    Students sd3 = new Students(studentid,name,age);
                    c1.add(sd3);
                    System.out.println("修改成功！");
                    break;
                case 4:
                    System.out.println("请输入想查找的学生姓名：");
                    name = sc1.next();
                    sd1.setName(name);
                    if(!c1.contains(sd1)){
                        System.out.println("该学生不存在！");
                    }
                    else{
                        for(Students sd : c1){
                            if(sd.getName().equals(name)){
                                System.out.println("您查找到学生信息为："+sd.toString());

                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("学生信息库："+c1);
                    break;
                default:
                    System.out.println("输入错误");
                    break;

            }




        }

    }
}
