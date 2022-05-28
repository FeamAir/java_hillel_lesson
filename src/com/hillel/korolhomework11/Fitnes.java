package com.hillel.korolhomework11;

public class Fitnes {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phoneNumber;


    private int age;

    public Fitnes(String name, int day, int month, int year, String email, String phoneNumber) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;


    }

    public int getAge(int year) {
        int nowYear = 2022;
        age = nowYear - year;
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDay() {

        return day;
    }


    public int getMonth() {

        return month;
    }


    public int getYear() {

        return year;
    }

    public String getMail() {
        return email;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }
}
