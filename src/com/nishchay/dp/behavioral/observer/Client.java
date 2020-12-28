package com.nishchay.dp.behavioral.observer;

public class Client {

    public static void main(String[] args) {

        Product product = new Product("IPhone 10");
        Observer user1 = new User("User1", product);
        Observer user2 = new User("User2", product);
        Observer user3 = new User("User3", product);
        Observer user4 = new User("User4", product);

        String currentStockStatus = product.getStatus();
        String changedStockStatus = "InStock";
        System.out.println("Product - " + product.getProdName() + ", is currently in status - " + product.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change : " + currentStockStatus + " -> " + changedStockStatus);
        product.setStatus(changedStockStatus);

        product.removeObserver(user3);

        currentStockStatus = product.getStatus();
        changedStockStatus = "OutOfStock";
        System.out.println("Product - " + product.getProdName() + ", is currently in status - " + product.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change : " + currentStockStatus + " -> " + changedStockStatus);
        product.setStatus(changedStockStatus);

    }
}
