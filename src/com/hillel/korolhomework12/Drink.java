package com.hillel.korolhomework12;

public abstract class Drink implements DrinkMaker{

    private static int totalCount;
    private final int  cnt;


    public Drink(int cnt) {

        this.cnt = cnt;
    }

    public abstract double getPrice();

    public void increase(int count){

        totalCount +=count;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public int getCnt() {
        return cnt;
    }

    @Override
    public void make() {
        increase(getCnt());
        String s = String.format(this + ": %s x %s = %.2f", cnt, getPrice(), order());
        System.out.println(s);
    }

    public double order() {
        return cnt * getPrice();
    }

    @Override
    public String toString() {
        return "Drink-" + getClass().getSimpleName();
    }
}