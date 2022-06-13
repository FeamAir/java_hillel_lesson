package com.hillel.korolhomework12;

public class Coffee extends Drink {

    public Coffee(int cnt) {
        super(cnt);
    }

    @Override
    public double getPrice() {

        return PriceList.COFFEE;
    }
}