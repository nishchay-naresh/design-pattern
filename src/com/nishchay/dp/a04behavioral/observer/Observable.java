package com.nishchay.dp.a04behavioral.observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
