package com.hillel.korolhomework5;


import java.util.Scanner;

public class SerchType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value ");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a > 0) {
                System.out.println("Ви ввели ціле позитивне число = " + a);
            } else {
                System.out.println("Ви ввели ціле негативне число = " + a);
            }
        } else if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            System.out.printf("Ви ввели дробне число = %.2f", a);
        } else {
            String a = scanner.nextLine();
            String upperCase = a.toUpperCase();
            String replace = upperCase.replace(" ", "");
            System.out.println("Ви ввели  строку = " + replace);
        }
    }
}
