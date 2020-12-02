package com.nishchay.dp.structural.flyweight;

import java.util.*;

public class CoffeeFactory {

    protected static Map<CoffeeFlavour, Coffee> coffeeMap = new HashMap<>();

    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeSugar coffeeSugar) {
        Coffee coffee = coffeeMap.get(flavourName);
        if (coffee == null) {
            coffee = new Coffee(flavourName, coffeeSugar);
            coffeeMap.put(flavourName, coffee);
        }

        System.out.printf("Making '%s' with '%d' spoon sugar.\n", coffee.getFlavourName().getName(), coffee.getCoffeeSugar().getSugar());
        return coffee;
    }

    public static int getNumberOfCoffee() {
        return coffeeMap.size();
    }
}