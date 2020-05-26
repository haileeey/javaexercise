package com.company.module4;

import java.io.Serializable;

public class UserMessage implements Serializable {
    private static final long serialVersionUID = -6418273463621940863L;
    public User1 u1;
    public String status;

    public UserMessage() {
    }

    public UserMessage(User1 u1, String status) {
        this.u1 = u1;
        this.status = status;
    }

    public User1 getU1() {
        return u1;
    }

    public void setU1(User1 u1) {
        this.u1 = u1;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "u1=" + u1 +
                ", status='" + status + '\'' +
                '}';
    }


}
