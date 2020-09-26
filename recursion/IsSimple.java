package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static boolean isSimple (int x, int d) {
        if (x <= 1) {
            return false;
        }
        // Все делители
        if (d * d >= x) {
            return true;
        }
        if (x % d == 0) {
            return false;
        }
        return isSimple(x, d + 1);
    }

    public static boolean isSimple (int x) {
        return Main.isSimple(x, 2);
    }

    public static void main(String[] args) {

        System.out.print(Main.isSimple(55));
    }

}
