package com.hillel.korolhomework6;

public class UnluckyNumber {
    public static void main(String[] args) {
        int shuttles = 100;
        int counter = 0;
        for (int i = 1; counter <= shuttles; i++) {
            String str = String.valueOf(i);
            if (!(str.contains("4") || str.contains("9"))) {
                System.out.println(counter + " - shuttle number" + i);
                counter++;
            }
        }

    }
}
