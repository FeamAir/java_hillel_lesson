package com.hillel.korolhomework12;

public class Lemonade extends Drink {
    public Lemonade(int cnt) {
        super(cnt);
    }

    @Override
    public double getPrice() {
        return PriceList.LEMONADE;
    }
}
