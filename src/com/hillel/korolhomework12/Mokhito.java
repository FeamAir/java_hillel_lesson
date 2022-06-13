package com.hillel.korolhomework12;

public class Mokhito extends Drink {

    public Mokhito(int cnt) {
        super(cnt);
    }

    @Override
    public double getPrice() {
        return PriceList.MOKHITO;
    }
}
