package com.nishchay.dp.behavioral.observer;

public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject("IPhone 10");
        Observer user1 = new User("User1", subject);
        Observer user2 = new User("User2", subject);
        Observer user3 = new User("User3", subject);
        Observer user4 = new User("User4", subject);

        String currentStockStatus = subject.getStatus();
        String changedStockStatus = "InStock";
        System.out.println("Product - " + subject.getProdName() +" ,is currently in status - " + subject.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change - " +  currentStockStatus + " -> " + changedStockStatus);
        subject.setStatus(changedStockStatus);

        subject.unRegister(user3);

        currentStockStatus = subject.getStatus();
        changedStockStatus = "OutOfStock";
        System.out.println("Product - " + subject.getProdName() +" ,is currently in status - " + subject.getStatus());
        System.out.println("Notification will be sent to all registered user for the state change - " +  currentStockStatus + " -> " + changedStockStatus);
        subject.setStatus(changedStockStatus);


    }
}
