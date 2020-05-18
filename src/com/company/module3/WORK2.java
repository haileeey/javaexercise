package com.company.module3;

public class WORK2 {
    public static void main(String[] args) {
        String s1 = "asdafghjka";
        String s2 = "aaasdfg";
        String sub1 = null;
        int l1 = s1.length();
        int l2 = s2.length();
        String long1 =null;
        String short1 = null;
        int small=0;
        if(l1<l2){
             small = l1;
             long1 = s2;
             short1 = s1;
        }else {
            small = l2;
            long1 = s1;
            short1 = s2;
        }

        while(small>0){
            for(int i=0; i<=(short1.length()-small); i++){
                sub1 = short1.substring(i,i+small);
                if(long1.contains(sub1)){
                    System.out.println(s1+"和"+s2+"的最大子集是"+sub1);
                    return;
                }
            }
            small--;
        }
    }
}
