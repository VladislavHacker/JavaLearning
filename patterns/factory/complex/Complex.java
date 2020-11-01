package com.company;

public class Complex {
    public Complex(int real, int imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public Complex add(Complex b) {
        return new Complex(real + b.real, imagine + b.imagine);
    }

    public String toString() {
        return "Real: " + real + ", Imagine: " + imagine;
    }

    private final int real;
    private final int imagine;
}
