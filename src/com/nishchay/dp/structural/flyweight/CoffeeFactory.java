package com.nishchay.dp.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    protected static List<Coffee> coffeeList = new ArrayList<Coffee>();

    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeSugar latteArt) {
        Coffee coffee = new Coffee(flavourName, latteArt);
        System.out.printf("Making '%s' with '%d' spoon suger.\n", coffee.getFlavourName(), coffee.getCoffeeSugar().getSugar());
        coffeeList.add(coffee);
        return coffee;
    }

    public static int getNumberOfCoffee() {
        return coffeeList.size();
    }
}