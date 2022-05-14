package com.hillel.korolhomework7;

import java.util.Random;
import java.util.Scanner;

public class SerchElement {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int startArraw = -20;
        int endArraw = 20;


        System.out.println("Enter Yours value ");
        if (scanner.hasNextInt()) {
            int nextVal = scanner.nextInt();
            int[] randomArrow = new int[nextVal];
            String string = "Random Arraw = ";
            for (int i = 0; i < randomArrow.length; i++) {
                randomArrow[i] = startArraw + random.nextInt((endArraw + endArraw) + 1);
                System.out.print(string + randomArrow[i]);
                string = ",";
            }
            int min = minValue(randomArrow);
            System.out.println("\nMinimum Value is: " + min);
            int max = maxValue(randomArrow);
            System.out.println("Maximum Value is: " + max);
            int average = averageValue(randomArrow);
            System.out.println("Average Value is: " + average);
        } else {
            System.out.println("Incorrect value");
        }

    }

    private static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    private static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    private static int averageValue(int[] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum / array.length;
    }
}
