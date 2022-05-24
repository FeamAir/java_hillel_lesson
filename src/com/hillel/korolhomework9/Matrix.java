package com.hillel.korolhomework9;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many you want column ? ");
        int column = scanner.nextInt();

        System.out.println("How many you want row? ");
        int row = scanner.nextInt();

        int[][] matrix = createMatrix(column, row);
        int[][] matrixTrans = transposed(matrix);

        printMatrix(matrix, matrixTrans);

    }


    private static void printMatrix(int[][] matrix, int[][] matrixTrans) {
        System.out.println("Matrix: ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed matrix: ");
        for (int[] matrixTran : matrixTrans) {
            for (int i : matrixTran) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    private static int[][] createMatrix(int column, int row) {
        Random random = new Random();
        int[][] matrix = new int[row][column];
        if (column != row) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = random.nextInt(10);
                }
            }
        } else {
            System.out.println("Not correct value");
        }
        return matrix;
    }

    private static int[][] transposed(int[][] matrix) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] matrixTwo = new int[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrixTwo[j][i] = matrix[i][j];
            }
        }
        return matrixTwo;
    }
}
