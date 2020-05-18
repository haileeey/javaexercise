package com.company.module3;

public class WORK1 {
    public static void main(String[] args) {
        String s1 = new String("ABCD123!@#$%ab");
        String reg1 = "[A-Z]";
        String reg2 = "[a-z]";
        String reg3 = "[0-9]";
        String reg4 = "\\W";
        int uppercase =0;
        int lowercase =0 ;
        int num=0;
        int others=0;


        for(int i=0; i<s1.length(); i++){
            String s2 = s1.substring(i,i+1);
            if(s2.matches(reg1)){
                uppercase++;
            }
            else if(s2.matches(reg2)){
                lowercase++;
            }
            else if(s2.matches(reg3)){
                num++;
            }
            else{
                others++;
            }
        }
        System.out.println("大写字母出现"+uppercase+"次");
        System.out.println("小写字母出现"+lowercase+"次");
        System.out.println("数字出现"+num+"次");
        System.out.println("其他字符出现"+others+"次");

    }
}
