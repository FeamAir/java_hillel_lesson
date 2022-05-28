package com.hillel.korolhomework10;

public class Burger {
    String bun,meat,cheese,green,mayonnaise;

    public Burger(String bun, String meat, String cheese, String green, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;

        System.out.println("Burger = "+ bun + ", " + meat + ", " + cheese + ", " + green + ", " + mayonnaise);

    }

    public Burger(String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;

        System.out.println("Vegan burger = "+ bun + ", " + meat + ", " + cheese + ", " + green );

    }

    public Burger(String bun, int secondMeat, String meat, String cheese, String green, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;

        System.out.println("Double meat burger = "+ bun + ", " + secondMeat + " " +  meat + ", " + cheese + ", "+ green + ", " + mayonnaise);
    }
}



