package com.hillel.home_work3;

public class Snowman {
    public static void main(String[] args) {

        double a = 1;
        double b = 0.5;
        double c = 0.2;
        double d = 0.7;

        double ball1 = (4.0 / 3.0) * Math.PI * Math.pow(a, 3) * d;
        double ball2 = (4.0 / 3.0) * Math.PI * Math.pow(b, 3) * d;
        double ball3 = (4.0 / 3.0) * Math.PI * Math.pow(c, 3) * d;
        double snowman = ball1 + ball2 + ball3;

        System.out.printf("Cніговик  важить  = %.2f kg", snowman);


    }
}
