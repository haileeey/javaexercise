package com.company.module3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WORK3 {
    public static void main(String[] args) {
        Map<String,String> m1 = new HashMap<>();
        String st1 = m1.put("1","123");
        m1.put("2","456");
        m1.put("3","789");
        m1.put("4","123");
        m1.put("5","456");
        int num123=0;
        int num456=0;
        int num789=0;
        Collection<String> st2 = m1.values();
        for(String ts: st2){
            if("123".equals(ts)){
                num123++;
            }
            else if("456".equals(ts)){
                num456++;
            }
            else if("789".equals(ts)){
                num789++;
            }
        }
        System.out.println("123 shows up:"+num123);
        System.out.println("456 shows up:"+num456);
        System.out.println("789 shows up:"+num789);


    }
}
