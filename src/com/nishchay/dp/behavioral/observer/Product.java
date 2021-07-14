package com.nishchay.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// concrete Observable class
public class Product implements Observable {

    private List<Observer> users;

    private final String prodName; // immutable
    private String status; // mutable - lead to state change

    public Product(String name) {
        super();
        this.prodName = name;
        this.status = "unknown";
        users = new ArrayList<>();
    }

    public String getProdName() {
        return prodName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObserver() {
        // notify all the observer
        for (Observer user : users) {
            user.sendNotification();
        }
    }

    public int getRegisterUserCount() {
       return users.size();
    }

}
