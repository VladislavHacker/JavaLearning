package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(30);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(30, 30);
        System.out.println(rectangle.toString());
        Square square = new Square(30);
        System.out.println(square.toString());

        Vector<Shape> vec = new Vector<Shape>();
        vec.add(new Circle(30));
        vec.add(new Rectangle(30, 30));
        vec.add(new Rectangle(30, 40));
        vec.add(new Square(25));
        System.out.println("Collection:");
        for (Shape shape : vec) {
            System.out.println(shape.toString());
        }

    }

}
