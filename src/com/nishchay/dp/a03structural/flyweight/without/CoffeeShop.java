package com.nishchay.dp.a03structural.flyweight.without;

import com.nishchay.dp.a03structural.flyweight.CoffeeFlavour;
import com.nishchay.dp.a03structural.flyweight.CoffeeSugar;

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