package com.company.module3;

public class CARD {
    private int weight;
    private String content;

    public CARD() {
    }

    public CARD(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CARD{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}
