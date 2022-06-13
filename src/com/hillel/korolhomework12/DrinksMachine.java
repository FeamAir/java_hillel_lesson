package com.hillel.korolhomework12;

public enum DrinksMachine {
    COFFEE(1),
    TEA(2),
    LEMONADE(3),
    MOKHITO(4),
    MINERAL_WATER(5),
    COCA_COLA(6);

    private final int value;

    DrinksMachine(int value) {
        this.value = value;
    }

    public static DrinksMachine convert(int drink){
        for (DrinksMachine drinkType : values()) {
            if (drinkType.value==drink) {
                return drinkType;
            }
        }return null;
    }

    @Override
    public String toString() {
        return value + "-" + name();
    }

}
