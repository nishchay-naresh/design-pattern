package com.nishchay.dp.structural.flyweight.without;

import com.nishchay.dp.structural.flyweight.Coffee;
import com.nishchay.dp.structural.flyweight.CoffeeFlavour;
import com.nishchay.dp.structural.flyweight.CoffeeSugar;

public class Order {

    protected Coffee coffee;

    public Order(Coffee coffee) {
        this.coffee = coffee;
    }

    public static Order of(CoffeeFlavour flavourName, CoffeeSugar latteArt, int tableNumber) {
        Coffee coffee = CoffeeFactory.makeCoffee(flavourName, latteArt);
        System.out.printf("Serving to table '%d'.\n", tableNumber);
        System.out.println("------------------------------------------------------");
        return new Order(coffee);
    }

    public Coffee getCoffee() {
        return coffee;
    }

}