package com.hillel.korolhomework7;

import java.util.Random;

public class TwoComands {
    public static void main(String[] args) {
        Random random = new Random();
        int totalGamers = 26;
        int minYears = 18;
        int maxYeras = 40;

        int[] firstComand = new int[totalGamers];
        int[] secondComand = new int[totalGamers];
        int sumFirstComand = 0;
        int sumSecondComand = 0;
        System.out.println("\tПервая команда \t\t Вторая команда");
        for (int i = 1; i < firstComand.length; i++) {
            firstComand[i] = minYears + random.nextInt((maxYeras - minYears) + 1);
            secondComand[i] = minYears + random.nextInt((maxYeras - minYears) + 1);
            sumFirstComand = firstComand[i] + sumFirstComand;
            sumSecondComand = secondComand[i] + sumSecondComand;
            System.out.print("Игрок " + i + " Ему лет = " + firstComand[i] + "\t");
            System.out.println("Игрок " + i + " Ему лет = " + secondComand[i]);

        }


        int sumYearsFirstComand = Math.round(sumFirstComand / totalGamers);
        int sumYearsSecondComand = Math.round(sumSecondComand / totalGamers);

        System.out.print("Средний возраст = " + sumYearsFirstComand + "\t");
        System.out.println("Средний возраст = " + sumYearsSecondComand);
    }
}
