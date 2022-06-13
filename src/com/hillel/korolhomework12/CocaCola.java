package com.hillel.korolhomework12;

public class CocaCola extends Drink{

    private String ice;
    public CocaCola(int cnt) {

        super(cnt);
    }

    public CocaCola(int cnt, String ice) {
        super(cnt);
        this.ice = ice;
    }

    @Override
    public double getPrice() {

        return PriceList.COCA_COLA;
    }

    @Override
    public String toString() {
        String withIce = ice != null ? " with ice" : "";
        return super.toString() + withIce;
    }
}
