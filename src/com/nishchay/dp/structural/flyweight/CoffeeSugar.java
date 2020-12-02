package com.nishchay.dp.structural.flyweight;

public enum CoffeeSugar {

    NO_SUGAR(0),
    ONE_SPOON(1),
    TWO_SPOON(2),
    THREE_SPOON(3);

    private int sugar;

    CoffeeSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }
}