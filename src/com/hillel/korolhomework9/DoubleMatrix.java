package com.hillel.korolhomework9;

import java.util.Random;
import java.util.Scanner;

public class DoubleMatrix {
    public static void main(String[] args) {
        int column, row, start, end;


        start = 0;
        end = 99;
        column = 3;
        row = 3;


        int[][] firstMatrix = createMatrix(column, row);
        int[][] secondMatrix = createMatrix(column, row);
        int[][] thirdMatrix = createMatrix(column, row);


        int[][] firstRandomMatrix = createRandomMatrix(firstMatrix, start, end);
        int[][] secondRandomMatrix = createRandomMatrix(secondMatrix, start, end);

        choiceMethod(firstRandomMatrix, secondRandomMatrix, thirdMatrix);

    }


    private static int[][] createMatrix(int column, int row) {
        int[][] matrix = new int[column][row];
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print("");
            }
        }
        return matrix;
    }

    private static int[][] createRandomMatrix(int[][] matrix, int start, int end) {
        Random random = new Random();
        System.out.println("Matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = start + random.nextInt((start + end) + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return matrix;
    }

    private static void resultMatrix(int[][] firstRandomMatrix, int[][] secondRandomMatrix, int[][] thirdMatrix, int a) {
        for (int i = 0; i < firstRandomMatrix.length; i++) {
            for (int j = 0; j < firstRandomMatrix.length; j++)
                if (a == 1) {
                    thirdMatrix[i][j] = firstRandomMatrix[i][j] + secondRandomMatrix[i][j];
                } else {
                    thirdMatrix[i][j] = firstRandomMatrix[i][j] * secondRandomMatrix[i][j];
                }

        }
        if (a == 1) {
            System.out.print("Result Addition Matrix: ");
            System.out.println();
        } else {
            System.out.print("Result Multiplication Matrix: ");
            System.out.println();
        }
        for (int i = 0; i < firstRandomMatrix.length; i++) {
            for (int j = 0; j < firstRandomMatrix.length; j++) {
                System.out.print(thirdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void choiceMethod(int[][] firstRandomMatrix, int[][] secondRandomMatrix, int[][] thirdMatrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you wish to do?\n" +
                "1) Addition\n" +
                "2) Multiplication ");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                resultMatrix(firstRandomMatrix, secondRandomMatrix, thirdMatrix, a);
                break;
            case 2:
                resultMatrix(firstRandomMatrix, secondRandomMatrix, thirdMatrix, a);
                break;
            default:
                System.out.println("No such choice\n");
        }
    }

}
