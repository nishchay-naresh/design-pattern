package com.nishchay.dp.behavioral.observer;

public interface Observable {

    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObserver();
}
