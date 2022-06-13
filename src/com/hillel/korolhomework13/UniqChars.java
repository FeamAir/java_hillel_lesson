package com.hillel.korolhomework13;


import java.util.Arrays;

public class UniqChars {
    public static void main(String[] args) {

        char[] result = uniqueChars("Using methods of class String");
        System.out.println(Arrays.toString(result));

    }

    private static char[] uniqueChars(String str) {
        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        return result.toCharArray();
    }
}
