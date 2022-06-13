package com.hillel.korolhomework13;

public class Regexp {
    public static void main(String[] args) {

        String[] arrays = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        for (String array : arrays) {
            System.out.println(array + " is " + checkPersonWithRegExp(array));
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        while ( true ) {
            int upp = 0, low = 0, other = 0;
            for ( char c : userNameString.toCharArray() ) {
                if ( Character.isUpperCase(c) )
                    ++upp;
                else if ( Character.isLowerCase(c) )
                    ++low;
                else
                    ++other;
            }
            return upp == 1 && low > 0 && other == 0;
        }
    }
}
