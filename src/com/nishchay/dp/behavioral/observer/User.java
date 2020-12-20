package com.nishchay.dp.behavioral.observer;

public class User implements Observer {

    private String name;
    private Observable observable;

    public User(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
        observable.register(this);
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification sent to user - " + name);
    }


}
