package com.nishchay.dp.structural.flyweight;

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