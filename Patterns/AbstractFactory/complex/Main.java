package com.company;

public class Main {

    public static void main(String[] args) {
         ConcreteFactory factory = new ConcreteFactory();
         System.out.println(factory.createComplex().toString());
         System.out.println(factory.CreateComplex(4, 5).add(factory.CreateComplex(7, 7)).toString());
    }
}
