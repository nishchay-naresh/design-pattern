package com.nishchay.dp.behavorial.observer;

import com.nishchay.dp.behavorial.observer.Observer;

public interface Observable {

    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObserver();
}
