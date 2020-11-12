package com.company;

public class Client {

    public void sit() {
        if (chair == null) {
            System.out.println("Как мне сидеть без стула?");
        } else {
            System.out.println("Я сижу.");
            chair.useAdvantages();
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Client() {
        this.chair = null;
    }

    private Chair chair;

}
