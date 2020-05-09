package com.company.iPhone;

public class Test {
    public static void main(String[] args) {
        PhoneCard[] arr1 = PhoneCard.values();
        for (int i=0; i < arr1.length; i++){
            arr1[i].show();
        }
        AbstractCombo ac1 = new DialCombo(80,160);
        ac1.showCombo();
        AbstractCombo ac2 = new OnlineCombo(40000000,40);
        ac2.showCombo();
        OnlineCombo oc = new OnlineCombo(4000000,50);
        oc.onlinefunction(6000000,arr1[1]);
        DialCombo dc = new DialCombo(60,200);
        dc.dialfunction(150,arr1[0]);


    }
}
