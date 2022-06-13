package com.hillel.korolhomework12;

public class Tea extends Drink {

    private final String milk;


    public Tea(int cnt, String milk) {
        super(cnt);
        this.milk = milk;
    }

    @Override
    public double getPrice() {

        return PriceList.TEA;
    }

    @Override
    public String toString() {
        String withMilk = milk != null ? " with milk" : "";
        return super.toString() + withMilk;
    }

}
