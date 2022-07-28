package com.company;

public class Cow extends Farm{
    int weight;
    int age;
    String gender;
    String nickName;

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public Cow(int weight, int age, String gender, String nickName) {
        super(null,0,0,0,null);
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
}

//1 чи Farmда 3 sheep,5 cows, 2 horses болсун.


    //   2 чи  Farmда 1 sheep, 1 cow, 1 horse болсун