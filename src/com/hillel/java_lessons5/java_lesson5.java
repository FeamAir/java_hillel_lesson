package com.hillel.java_lessons5;

import java.util.Scanner;

public class java_lesson5 {
//    public static void main(String[] args) {
//        int a = 0;
//        if (a >= -100 || a < 100) {
//            if (a == 0) {
//                System.out.println("Zero ");
//            } else if (a > 0) {
//                System.out.println("Positive " + a);
//            } else {
//                System.out.println("Negative " + a);
//            }
//        }
//
//    }
//}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter value ");

    int a = scanner.nextInt();



    if (a >= -100 && a <= 100) {
        calculateValue(a);
    } else {
            System.out.println("The number should be in range -100 to 100 ");
        }
    }


    private static void calculateValue(int a) {


    }
}