package com.nishchay.dp.behavioral.observer;

public class Client {

    public static void main(String[] args) {

        Product product = new Product("IPhone 10");

        Observer user1 = new User("User1");
        Observer user2 = new User("User2");
        Observer user3 = new User("User3");
        Observer user4 = new User("User4");

        product.addObserver(user1);
        product.addObserver(user2);
        product.addObserver(user3);
        product.addObserver(user4);

        System.out.println("RegisterUserCount - " + product.getRegisterUserCount());
        String changedStockStatus = "InStock";
        String currentStockStatus = product.getStatus();
        System.out.println("Product - " + product.getProdName() + ", is currently in status - " + product.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change : " + currentStockStatus + " -> " + changedStockStatus);
        product.setStatus(changedStockStatus);

        product.removeObserver(user3);

        System.out.println("RegisterUserCount - " + product.getRegisterUserCount());
        changedStockStatus = "OutOfStock";
        currentStockStatus = product.getStatus();
        System.out.println("Product - " + product.getProdName() + ", is currently in status - " + product.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change : " + currentStockStatus + " -> " + changedStockStatus);
        product.setStatus(changedStockStatus);

    }
}

/*
 * O/P =>
 *      RegisterUserCount - 4
 *      Product - IPhone 10, is currently in status - unknown
 *      Notification will be sent to all registered user for the state change : unknown -> InStock
 *      Notification sent to user - User1
 * 		Notification sent to user - User2
 * 		Notification sent to user - User3
 * 		Notification sent to user - User4
 * 		RegisterUserCount - 3
 * 		Product - IPhone 10, is currently in status - InStock
 * 		Notification will be sent to all registered user for the state change : InStock -> OutOfStock
 * 		Notification sent to user - User1
 * 		Notification sent to user - User2
 * 		Notification sent to user - User4
 *
 * */