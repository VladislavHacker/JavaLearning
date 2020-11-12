package com.company;

public class Main {

    public static void main(String[] args) {
	    ChairFactory factory = new ChairFactory();
	    Client vasiliy = new Client();
	    vasiliy.setChair(factory.createFunctionalChair());
	    vasiliy.sit();
	    vasiliy.setChair(factory.createVictorianChair(600));
	    vasiliy.sit();
	    vasiliy.setChair(factory.createMagicChair());
	    vasiliy.sit();
    }
}
