package com.nishchay.dp.behavioral.observer;

// concrete Observer class
public class User implements Observer {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent to user - " + userName);
    }

}
