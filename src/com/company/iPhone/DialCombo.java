package com.company.iPhone;

public class DialCombo extends AbstractCombo implements DialService{
    private int dialTime;

    public int getDialTime() {
        return dialTime;
    }

    public void setDialTime(int dialTime) {
        this.dialTime = dialTime;
    }


    public DialCombo(int monthFee, int dialTime) {
        super(monthFee);
        this.dialTime = dialTime;
    }

    @Override
    public void showCombo() {
        System.out.println("显示通话套餐信息：通话时长"+getDialTime()+" 每月资费："+getMonthFee());
    }

    @Override
    public void dialfunction(int minutes, PhoneCard pc) {
        pc.setDialTime(minutes);
        System.out.println("让通话套餐类实现通话服务接口, 通话时长变成："+pc.getDialTime());
    }
}
