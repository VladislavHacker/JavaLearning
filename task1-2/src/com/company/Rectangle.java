package com.company;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

    public Rectangle () {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle (double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle (double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "rectangle " + width + "x" + height + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
