package com.company.module4;

import java.io.Serializable;

public class User1 implements Serializable {
    private static final long serialVersionUID = 5962425052741591071L;
    public String name;
    public String password;

    public User1() {
    }

    public User1(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
