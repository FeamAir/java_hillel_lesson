package com.hillel.java_lessons5;

import java.util.Scanner;

public class JavaPractick2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value ");

        int a = scanner.nextInt();

        if (a==1){
            System.out.println("monday");
        }else if(a==2){
            System.out.println("Tuesday ");
        }else if(a==3) {

        }else if(a==4) {
            System.out.println("Thursday");
        }else if(a==5) {
            System.out.println("Friday ");
        }else if(a==6) {
            System.out.println("Saturday");
        }else if(a==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Нет такого дня");
        }


    }

}
