package com.company.module4;

import java.io.File;

public class Work2 {

    public static void deleteall (File f1){
        File[] filearray = f1.listFiles();
        for(File f2: filearray){
            if(f2.isFile()){
                System.out.println("正在删除"+f2.getAbsolutePath());
                f2.delete();
            }else if(f2.isDirectory()){
                deleteall(f2);
                System.out.println("正在删除"+f2.getAbsolutePath());
                f2.delete();
            }
        }
        System.out.println("正在删除"+f1.getAbsolutePath());
        f1.delete();
    }
    public static void main(String[] args) {
        File f1 = new File("/Users/lilinrong/Desktop/b/c/d/2");
        f1.mkdirs();
        File f2 = new File("/Users/lilinrong/Desktop/b");
        deleteall(f2);


    }
}
