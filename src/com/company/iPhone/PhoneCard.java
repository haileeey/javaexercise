package com.company.iPhone;

public enum PhoneCard {
    BIG(11374658,"jack",20),SMALL(19362839,"lucy",40),MICRO(19745378,"candy",80);
    private int phoneNum;
    private String name;
    private int password;
    private int accountBalance;
    private int dialTime;
    private int moblieData;

    private PhoneCard(int phoneNum, String name, int accountBalance) {
        this.phoneNum = phoneNum;
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public void show(){
        System.out.println("phonenumber:"+phoneNum);
        System.out.println("user name:"+name);
        System.out.println("balance of account:"+accountBalance);
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getDialTime() {
        return dialTime;
    }

    public void setDialTime(int dialTime) {
        this.dialTime = dialTime;
    }

    public int getMoblieData() {
        return moblieData;
    }

    public void setMoblieData(int moblieData) {
        this.moblieData = moblieData;
    }




}
