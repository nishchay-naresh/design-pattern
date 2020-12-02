package com.nishchay.dp.structural.flyweight.without;

import com.nishchay.dp.structural.flyweight.Coffee;
import com.nishchay.dp.structural.flyweight.CoffeeFlavour;
import com.nishchay.dp.structural.flyweight.CoffeeSugar;

import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    protected static List<Coffee> coffeeList = new ArrayList<Coffee>();

    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeSugar coffeeSugar) {

        Coffee coffee = new Coffee(flavourName, coffeeSugar);

        System.out.printf("Making '%s' with '%d' spoon suger.\n", coffee.getFlavourName(), coffee.getCoffeeSugar().getSugar());

        coffeeList.add(coffee);

        return coffee;

    }

    public static int getNumberOfCoffee() {
        return coffeeList.size();
    }

}