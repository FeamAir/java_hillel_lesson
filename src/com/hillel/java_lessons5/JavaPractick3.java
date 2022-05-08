package com.hillel.java_lessons5;

import java.util.Locale;
import java.util.Scanner;

public class JavaPractick3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value ");
        boolean hasNextInt = scanner.hasNextInt();
        String result = hasNextInt ? "Value integer" : "Other type";
//        int a = scanner.nextInt();

        System.out.println("Check is int; " + result);

        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());

    }

}
