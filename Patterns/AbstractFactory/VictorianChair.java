package com.company;

public class VictorianChair implements Chair {

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private final int age;

    @Override
    public void useAdvantages() {
        System.out.println(age + " мой стул старее тебя!");
    }

}
