package com.nishchay.dp.structural.flyweight.without;

import com.nishchay.dp.structural.flyweight.CoffeeFlavour;
import com.nishchay.dp.structural.flyweight.CoffeeSugar;


/*
 *
 * Without flywight approach, we are end up creating 10 coffee objects
 * With flywight approach, we are end up creating 5 coffee objects only
 *
 * Main difference lies in - CoffeeFactory class
 *       Coffee coffee = new Coffee(flavourName, coffeeSugar);
 *           vs
 *       Coffee coffee = coffeeMap.get(flavourName);
 *
 *	Object count	when !shared	when shared
 *	CAPPUCCINO 		-	3 			1
 *	FRAPPE			- 	1			1
 *	ESPRESSO		- 	2			1
 *	LATTE			- 	2			1
 *	MOCHA			- 	2			1
 *
 * */
public class Main {

    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop();

        shop.takeOrder(CoffeeFlavour.CAPPUCCINO, CoffeeSugar.ONE_SPOON, 5);
        shop.takeOrder(CoffeeFlavour.FRAPPE, CoffeeSugar.NO_SUGAR, 7);
        shop.takeOrder(CoffeeFlavour.ESPRESSO, CoffeeSugar.THREE_SPOON, 1);
        shop.takeOrder(CoffeeFlavour.LATTE, CoffeeSugar.THREE_SPOON, 3);
        shop.takeOrder(CoffeeFlavour.CAPPUCCINO, CoffeeSugar.TWO_SPOON, 2);
        shop.takeOrder(CoffeeFlavour.ESPRESSO, CoffeeSugar.NO_SUGAR, 8);
        shop.takeOrder(CoffeeFlavour.MOCHA, CoffeeSugar.NO_SUGAR, 4);
        shop.takeOrder(CoffeeFlavour.CAPPUCCINO, CoffeeSugar.ONE_SPOON, 10);
        shop.takeOrder(CoffeeFlavour.LATTE, CoffeeSugar.THREE_SPOON, 6);
        shop.takeOrder(CoffeeFlavour.MOCHA, CoffeeSugar.TWO_SPOON, 9);

        System.out.println("Number of Order Objects: " + CoffeeShop.getNumberOfOrders());
        System.out.println("Number of Coffee Objects: " + CoffeeFactory.getNumberOfCoffee());
    }

}