package com.hillel.korolhome_work5;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value ");
        double a = scanner.nextDouble();
        System.out.println("How many values we leave after the decimal point ??");
        int rounding = scanner.nextInt();

        double totalValue = doubleToDecimalPlaces(a,rounding);
        System.out.println("result of " + rounding +" decimal: " + totalValue);

    }

    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
        String toString = Integer.toString(countAfterPoint);
        String string = "%.";
        String sumString = string.concat(toString).concat("f");
        String newString = String.format(sumString, number).replace(",",".");
        return Double.parseDouble(newString);


    }
}
