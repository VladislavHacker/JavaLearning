package com.company;

public class Main {

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.addAllDelimiters("Russia, Moscow; Moscow, Old Arbat; 10, 2, 123");
        test.addComma("Russia, Moscow, Moscow, New Arbat, 1, 1, 120");
        test.addAllDelimiters("USA. New-York, New-York. Broadway, 1; 1, 1");
        test.addComma("Russia, Nizhegorodskiy, Nizhny Novgorod, Bolshaya Pokrovskaya , 10, 2, 123");
        test.printAll();
    }
}
