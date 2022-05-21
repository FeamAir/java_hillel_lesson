package com.hillel.korolhomework8;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int totalValuesNum = 7;
        int limitNumbers = 9;


        int[] valPerson = valuesPerson(totalValuesNum, limitNumbers);
//        System.out.println("Person value: " + Arrays.toString(valPerson));

        int[] valCompany = valuesCompany(totalValuesNum, limitNumbers);
//        System.out.println("Company numbers: " + Arrays.toString(valCompany));


        int cnt = numCounter(valPerson, valCompany);
        System.out.println(Arrays.toString(valCompany) + "\n" + Arrays.toString(valPerson) + "\nК-ть співпадінь: " + cnt);


    }

    private static int[] valuesCompany(int val, int limit) {
        Random random = new Random();
        int[] randomArray = new int[val];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(limit + 1);
        }
        return randomArray;
    }

    private static int[] valuesPerson(int val, int limit) {
        int[] personArray = new int[val];
        System.out.println("Enter " + val + " numbers from 0 to 9; ");
        for (int i = 0; i < personArray.length; i++) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                int enter = scanner.nextInt();
                if (enter <= limit) {
                    personArray[i] = enter;
                    if (val > 1 ) {
                        System.out.println("You have entered " + enter + "! Remaining  " + --val + " element(s)");
                    } break;
                } else {
                    System.out.println("Invalid data entered = " + enter + "!!! try again");
                }
            }
        }

        return personArray;
    }

    private static int numCounter(int[] firstLst, int[] secondLst) {
        Arrays.sort(firstLst);
        Arrays.sort(secondLst);
        int cnt = 0;
        for (int i = 0; i < firstLst.length; i++) {
            if (firstLst[i] == secondLst[i]) {
                cnt += 1;
            }

        }
        return cnt;
    }
}
