package com.company;

public class Sheep extends Farm{
    int weight;
    int age;
    String gender;
    String nickName;

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Sheep(int weight, int age, String gender, String nickName) {
        super(null,0,0,0,null);
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
}
