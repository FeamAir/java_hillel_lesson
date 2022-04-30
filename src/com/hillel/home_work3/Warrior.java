package com.hillel.home_work3;

public class Warrior {
    public static void main(String[] args) {
        String first = "LI";
        int a = 13;
        int b = 24;
        int c = 46;
        int warriors = 860;

        String second = "Min";
        int d = 9;
        int e = 35;
        int f = 12;

        int total1 = (a + b + c) * warriors * 3;
        double total2 = (d + e + f) * (warriors * 1.5) * 3;


        System.out.println("The " + first + " dynasty has attack = " + total1);
        System.out.println("The " + second + " dynasty has attack = " + (int) total2);


    }
}
