package com.nishchay.dp.structural.flyweight;

public enum CoffeeFlavour {

    CAPPUCCINO("Cappuccino"),
    ESPRESSO("Espresso"),
    LATTE("Latte"),
    MOCHA("Mocha"),
    FRAPPE("Frappe");


    private String name;

    CoffeeFlavour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
