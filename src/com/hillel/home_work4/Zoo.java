package com.hillel.home_work4;

public class Zoo {

    public static void main(String[] args) {
        int bears = 12;
        int tigers = 27;
        int parrots = 23;
        int elephants = 7;
        int raccoons = 16;
        int porcupine = 29;


        countAnimal(bears, tigers, parrots, elephants, raccoons);
        countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons);
        countAnimalsNextYear(bears, tigers, parrots, elephants, raccoons, porcupine);


    }

    private static Integer countAnimal(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = bears + tigers + parrots + elephants + raccoons;
        System.out.println("У зоопарку цього року = " + result + " тварин");
        return result;

    }

    private static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons) {
        int result = Math.round(bears * (float) 0.3 + tigers * (float) 0.2 + parrots * (float) 0.4 + elephants * (float) 0.05 + raccoons * (float) 0.8);
        System.out.println("Кількість тварин за рік = " + result + " тварина");
        return result;
    }

    private static int countAnimalsNextYear(int bears, int tigers, int parrots, int elephants, int raccoons, int porcupine) {
        int resultbears = Math.round(bears * (float) 0.3);
        int resulttigers = Math.round(tigers * (float) 0.2);
        int resultparrots = Math.round(parrots * (float) 0.4);
        int resultelephants = Math.round(elephants * (float) 0.05);
        int resultraccoons = Math.round(raccoons * (float) 0.8);
        int resultporcupine = Math.round(porcupine * (float) 0.15);

        int result = resultbears + resulttigers + resultparrots + resultelephants + resultraccoons + resultporcupine;
        System.out.println("Кількість тварин за рік з урухованням дикобраза = " + result + " тварин ");
        return result;
    }

}
