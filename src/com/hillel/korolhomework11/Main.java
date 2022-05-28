package com.hillel.korolhomework11;

public class Main {

    public static void main(String[] args) {

        FitnesCreate firstPerson = new FitnesCreate(
                "Mark",
                30 ,
                11,
                1835,
                "mark@gmail.com",
                "+1875302345",
                "Twen",
                75,
                165,
                1500);

        FitnesCreate secondPerson = new FitnesCreate(
                "David",
                21,
                8,
                1991,
                "david@gmail.com",
                "+3809715736",
                "Back",
                81,
                175,
                1300);

        FitnesCreate thirdPerson = new FitnesCreate(
                "Mark",
                7,
                11,
                1964,
                "mark@gmail.com",
                "+157315736",
                "Bernard",
                120,
                175,
                600);


        firstPerson.printAccountInfo();
        secondPerson.printAccountInfo();
        thirdPerson.printAccountInfo();
        firstPerson.pressure = 181;
        secondPerson.weight = 91;
        thirdPerson.cntSteps = 750;
        System.out.println("\nChange ===========================\n");
        firstPerson.printAccountInfo();
        secondPerson.printAccountInfo();
        thirdPerson.printAccountInfo();



    }

}
