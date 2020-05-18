package com.company.module3;

import java.util.*;

public class WORK5 {
    public static void main(String[] args) {
        List<CARD> m1 = new ArrayList<>();
        int k = 3;
        m1.add(new CARD(1,"大王"));
        m1.add(new CARD(2,"小王"));
        String[] strs1 = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] strs2 = {"草花","方片","红桃","黑桃"};
        for (int i = 0; i< strs1.length; i++){
            for(int j=0; j<4; j++){
                m1.add(new CARD(k,strs2[j]+strs1[i]));
                k++;
            }
        }
        //Collections.sort(m1);

        Collections.shuffle(m1);
        System.out.println(m1);
        Comparator<CARD> com1 = (CARD c1, CARD c2) ->{ return c1.getWeight()-c2.getWeight();};

        Set<CARD> s1 = new TreeSet<>(com1);
        Set<CARD> s2 = new TreeSet<>(com1);
        Set<CARD> s3 = new TreeSet<>(com1);
        Set<CARD> s4 = new TreeSet<>(com1);
        for(int i=0; i<54; i++){
            if(i>=0 && i<17){
                s1.add(m1.get(i));
            }
            else if(i>=17 && i<34){
                s2.add(m1.get(i));

            }
            else if(i>=34 && i<51){
                s3.add(m1.get(i));

            }else{
                s4.add(m1.get(i));

            }
        }
        System.out.println("第一个人的牌："+s1);
        System.out.println("第二个人的牌："+s2);
        System.out.println("第三个人的牌："+s3);
        System.out.println("底牌："+s4);





    }
}
