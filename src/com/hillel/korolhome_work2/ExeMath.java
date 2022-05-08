package com.hillel.korolhome_work2;

public class ExeMath {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 15;

        int volume = x * y * z;
        int length = 4 * (x + y + z);

        float nord = 48.8582573f;
        float east = 2.2945111f;

        System.out.println("Об’єм  паралелепіпеда = " + volume);
        System.out.println("Cумарна довжина всіх сторін = " + length);
        System.out.printf("Ейфелева вежа — координати: " + nord + " Північної широти та " + east + " Cхідної довготи");


    }

}
