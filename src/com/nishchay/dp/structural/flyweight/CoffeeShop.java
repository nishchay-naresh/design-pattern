package com.nishchay.dp.structural.flyweight;

import java.util.ArrayList;

public class CoffeeShop {

    private static final ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(CoffeeFlavour flavourName, CoffeeSugar coffeeSugar, int tableNumber) {
        orders.add(Order.of(flavourName, coffeeSugar, tableNumber));
    }

    public static int getNumberOfOrders() {
        return orders.size();
    }

}