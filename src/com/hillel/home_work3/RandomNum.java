package com.hillel.home_work3;

import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter min limit");
        int min = scanner.nextInt();
        System.out.println("Enter max limit");
        int max = scanner.nextInt();
        int result = min + (int) (Math.random() * (max - (min-1)));
        System.out.println("The random value is " + result + " range : " + min + " and " + max);


    }
}
