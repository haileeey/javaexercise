package com.company.iPhone;

public abstract class AbstractCombo {
    protected int monthFee;

    public AbstractCombo() {
    }

    public AbstractCombo(int monthFee) {
        this.monthFee = monthFee;
    }

    public int getMonthFee() {
        return monthFee;
    }

    public void setMonthFee(int monthFee) {
        this.monthFee = monthFee;
    }
    public abstract void showCombo();
}
