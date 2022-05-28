package com.hillel.korolhomework10;

public class BurgerHouse {
    public static void main(String[] args) {
        String bun = "Bun";
        String meat = "Meat";
        String cheese = "Cheese";
        String green = "Green";
        String mayonnaise = "Mayonnaise";
        int doubleMeat = 2;


        Burger burgers = new Burger(bun, meat, cheese, green, mayonnaise);
        Burger burgers1 = new Burger(bun, meat, cheese, green);
        Burger burgers2 = new Burger(bun, doubleMeat, meat, cheese, green, mayonnaise);


    }
}
