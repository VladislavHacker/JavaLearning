package com.company;

public class Main {

    public static void main(String[] args) {
        MovablePoint x = new MovablePoint(1,2,1,1);
        MovableCircle c = new MovableCircle(1, 1, 1, 1, 5);
        MovableRectangle rect = new MovableRectangle(1, 1, 1, 1, 5, 6);
        rect.moveDown();
        rect.moveDown();
        rect.isCorrect();
    }

}
