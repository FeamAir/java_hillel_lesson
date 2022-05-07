package com.hillel.home_work4;

public class Person {

    public static void main(String[] args) {

        String fpersonname = "Will";
        String fperseonlastname = "Smith";
        String fpersontown = "New York";
        String fpersonnumphone = "2936729462846";

        String spersonname = "Jackie";
        String spersonlastname = "Chan";
        String spersontown = "Shanghai";
        String spersonnumphone = "12312412412";

        String tpersonname = "Sherlock";
        String tpersonlastname = "Holmes";
        String tpersontown = "London";
        String tpersonnumphone = "2936729462568";

        System.out.println(personInfo(fpersonname, fperseonlastname, fpersontown, fpersonnumphone));
        System.out.println(personInfo(spersonname, spersonlastname, spersontown, spersonnumphone));
        System.out.println(personInfo(tpersonname, tpersonlastname, tpersontown, tpersonnumphone));

    }

    private static String personInfo(String name, String lastname, String town, String numphone) {
        String result = "Зателефонувати громадяну " + name + " " + lastname + " із міста " + town + " можливо за номером " + numphone;
        return result;

    }
}
