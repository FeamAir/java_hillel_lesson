package com.hillel.korolhomework6;

public class Pyramid {
    public static void main(String[] args) {
        char a = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                int diff = i - j;
                if (i % 2 == 0) {
                    System.out.print(diff + " ");
                } else {
                    System.out.print((char) (diff + a - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}