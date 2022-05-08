package com.hillel.korolhomework5;

import java.util.Scanner;

public class RoundingPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Double value ");

        if (scanner.hasNextDouble()) {
            double nextDouble = scanner.nextDouble();
            System.out.println("How many values we leave after the decimal point ??");
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                if (nextInt > 0) {
                    double totalValue = doubleToDecimalPlaces(nextDouble,nextInt);
                    System.out.println("result of " + nextInt +" decimal: " + totalValue);
                } else {
                    System.out.println("You enter wrong value");
                }
            }else{
                System.out.println("You enter wrong value");
            }
        }else{
            System.out.println("You enter wrong value");
        }

    }
    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        String toString = Integer.toString(countAfterPoint);
        return Double.parseDouble(String.format("%."+toString+"f", number).replace(",","."));
    }

}

