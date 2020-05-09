package com.company.iPhone;

public class UserConsume {
    private int calculateDial;
    private int calculateData;
    private int monthConsume;

    public UserConsume(int calculateDial, int calculateData, int monthConsume) {
        this.calculateDial = calculateDial;
        this.calculateData = calculateData;
        this.monthConsume = monthConsume;
    }
    public void show(){
        System.out.println("用户消费信息(统计通话时长、统计上网流量、每月消费金额): "+calculateDial+" "+calculateData+" "+monthConsume);
    }
}
