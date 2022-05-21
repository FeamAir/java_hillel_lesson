package com.hillel.korolhomework8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int totalValuesNum, limitNumbers;

        totalValuesNum = 7;
        limitNumbers = 9;


        int[] valListFirst = valuesList(totalValuesNum, limitNumbers);
        System.out.println("Random list numbers: " + Arrays.toString(valListFirst));

        bubbleSort(valListFirst);
        System.out.println("After sort list numbers: " + Arrays.toString(valListFirst));


        doubleSerch(valListFirst);


    }

    private static void doubleSerch(int[] array) {
        int first = 0;
        int last = array.length - 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an element for binary search: ");
        int item = scanner.nextInt();
        int position = (first + last) / 2;
        while ((array[position] != item) && (first <= last)) {
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Your element = " + item + ", has an index in the array = " + position);
        } else {
            System.out.println("Element not found in array. Try again ");
            doubleSerch(array);
        }
    }


    private static int[] valuesList(int val, int limit) {
        Random random = new Random();
        int[] randomArray = new int[val];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(limit + 1);
        }
        return randomArray;
    }

    private static void bubbleSort(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    buffer = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = buffer;
                }

            }

        }
    }
}
