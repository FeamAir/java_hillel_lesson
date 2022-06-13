package com.hillel.korolhomework12;

public class MineralWater extends Drink {

    public MineralWater(int cnt) {
        super(cnt);
    }

    @Override
    public double getPrice() {
        return PriceList.MINERAL_WATER;
    }
}
