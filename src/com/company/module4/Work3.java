package com.company.module4;

import java.io.*;

public class Work3 {
    public static void copydir(File source, File targert){
        if(!targert.exists()){
            targert.mkdirs();
        }
        File[] filearray = source.listFiles();
        for(File f1 : filearray){
            if(f1.isFile()){
                copyfile(f1,new File(targert.getAbsolutePath()+File.separator+f1.getName()));


            }else if(f1.isDirectory()){
                copydir(f1,new File(targert,f1.getName()));

            }
        }
    }

    public static void copyfile(File source, File target){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

            try {
                bis = new BufferedInputStream(new FileInputStream(source));
                bos = new BufferedOutputStream(new FileOutputStream(target));
                byte[] b = new byte[1024];
                int len;
                 while((len=bis.read(b))!=-1){
                    bos.write(b,0,len);
                }
                 bos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {

                        try {
                            if(null!=bis)
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        try {
                            if(null!=bos)
                                bos.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

            }



    }

    public static void main(String[] args) {
        File f1 = new File("/Users/lilinrong/Desktop/b");
        File f2 = new File("/Users/lilinrong/Desktop/b_copy");
        copydir(f1,f2);
    }
}
