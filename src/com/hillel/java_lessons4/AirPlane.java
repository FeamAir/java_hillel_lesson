package com.hillel.java_lessons4;

public class AirPlane {
    public static void main(String[] args) {

        int factorial = factorial(5);
        System.out.println("factorial " + factorial);

    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        System.out.println(firstAirPlane(type,name));
//        System.out.println(firstAirPlane(type,name,firstClassPassengers));
//        System.out.println(firstAirPlane(type,name,firstClassPassengers,secondClassPassengers));
//
//
//    }
//
//    public static String firstAirPlane(String type , String name) {
//        return type + name;
//    }
//    public static String firstAirPlane(String type , String name, Integer sum ) {
//        return type + name + sum;
//    }
//    public static String firstAirPlane(String type , String name, Integer sum, Integer maxsum ) {
//        return "Yours Airplane:" + "\n" +"Type= " + type + ";" + " Name = " + name + ";" + " Total Passanger = " + sum + ";" + " Lux Pasanger = " + maxsum + ";";
//    }
//}



//
//public class Track {
//    public static void main(String[] args) {
//        int lenth = 20;
//        int weight = 30;
//        int height = 10;
//        System.out.println("You volume = " + countVolume(lenth, weight, height));
//    }
//
//    public static int countVolume(int lenth, int weight, int height) {
//        return lenth * weight * height;
//
//    }
//}
