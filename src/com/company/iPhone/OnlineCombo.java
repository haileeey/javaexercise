package com.company.iPhone;

public class OnlineCombo extends AbstractCombo implements OnlineService{
    @Override
    public void showCombo() {
        System.out.println("显示上网套餐信息：上网流量"+moblieData+" 每月资费："+getMonthFee());
    }
    private int moblieData;



    public OnlineCombo(int moblieData, int monthFee) {
        super(monthFee);
        this.moblieData = moblieData;
    }

    @Override
    public void onlinefunction(int data, PhoneCard pc) {
        pc.setMoblieData(data);
        System.out.println("让上网套餐类实现上网服务接口, 上网流量变成："+pc.getMoblieData());
    }
}
