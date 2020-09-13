package com.company;

public class Square extends Rectangle {

    public Square () {
        super();
    }

    public Square (double side) {
        super(side, side);
    }

    public Square (double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square " + width + "x" + height + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
