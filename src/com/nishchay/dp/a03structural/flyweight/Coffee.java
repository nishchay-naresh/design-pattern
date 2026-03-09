package com.nishchay.dp.a03structural.flyweight;

public class Coffee {

    protected final CoffeeFlavour flavourName;
    protected final CoffeeSugar coffeeSugar;

    public Coffee(CoffeeFlavour flavourName, CoffeeSugar coffeeSugar) {
        this.flavourName = flavourName;
        this.coffeeSugar = coffeeSugar;
    }


    public CoffeeFlavour getFlavourName() {
        return flavourName;
    }

    public CoffeeSugar getCoffeeSugar() {
        return coffeeSugar;
    }

}