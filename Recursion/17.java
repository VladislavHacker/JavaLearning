package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static int findMax () {

        int x = Main.sc.nextInt();
        if (x != 0) {
            int max = findMax ();
            if (max < x) {
                return x;
            } else {
                return max;
            }
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
	    Main.sc = new Scanner(System.in);
	    int max = Main.findMax();
        System.out.print(max);
    }

}
