package com.hillel.korolhomework12;

import java.util.Arrays;
import java.util.Scanner;

public class DrinksHouse {
    public static final int EXIT = 2;
    private static Drink[] drinks = new Drink[0];

    public static void main(String[] args) {

        int typeOfDrink;
        do {
            for (int i = 0; i < DrinksMachine.values().length; i++) {
                System.out.println(DrinksMachine.values()[i]);
            }
            typeOfDrink = getInputIntDigitsUser("Choose your drink \n");
        } while (!makeDrinks(typeOfDrink));
    }

    private static boolean makeDrinks(int typeOfDrink) {
        DrinksMachine drink = DrinksMachine.convert(typeOfDrink);
        if (drink != null) {
            int count = getInputIntDigitsUser("Enter amount of drink\n");
            switch (drink) {
                case COFFEE:
                    drinks = addToArray(drinks, new Coffee(count));
                    break;
                case TEA:
                    int milk = getInputIntDigitsUser("Do you want to add milk?(1-yes/2-no):\n");
                    Answer answerAddMilk = Answer.convert(milk);
                    drinks = addToArray(drinks, new Tea(count, answerAddMilk.toString()));
                    break;
                case LEMONADE:
                    drinks = addToArray(drinks, new Lemonade(count));
                    break;
                case MOKHITO:
                    drinks = addToArray(drinks, new Mokhito(count));
                    break;
                case MINERAL_WATER:
                    drinks = addToArray(drinks, new MineralWater(count));
                    break;
                case COCA_COLA:
                    int ice = getInputIntDigitsUser("Do you want to add ice(1-yes/2-no):\n");
                    Answer answerAddIce = Answer.convert(ice);
                    drinks = addToArray(drinks, new CocaCola(count,answerAddIce.toString()));
                    break;
            }
            int choice = getInputIntDigitsUser("Do you want to add additional drink?(1-yes/2-no)\n");
            if (choice == EXIT){
                createBill(drinks);
                return true;
            }
        }
        return false;
    }

    private static void createBill(Drink[] drinks) {
        double sum = 0;
        for (Drink drink : drinks) {
            drink.make();
            sum+=drink.order();
        }
        System.out.println("Your bill is");
        System.out.printf("Count of drinks: %d and total cost: %.2f", Drink.getTotalCount(), sum);
    }

    private static <T>T[] addToArray(T[] array, T element) {
        T[] copyOf = Arrays.copyOf(array, array.length + 1);
        copyOf[copyOf.length - 1] = element;
        return copyOf;
    }

    private static int getInputIntDigitsUser(String messageUser) {
        boolean inputDigits = false;
        int a = 0;
        while (!inputDigits) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(messageUser);

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                inputDigits = true;

            } else {
                System.out.println("Try again");
            }
        }
        return a;
    }
}
