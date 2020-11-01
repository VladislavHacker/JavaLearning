package com.company;

public class FunctionalChair implements Chair {

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void useAdvantages() {
        System.out.println(sum(2, 2) + " Я умею считать 2+2!");
    }

}
