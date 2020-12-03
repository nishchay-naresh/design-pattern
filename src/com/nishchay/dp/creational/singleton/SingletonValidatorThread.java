package com.nishchay.dp.creational.singleton;

public class SingletonValidatorThread implements Runnable {

    ThreadSafeSingleton singleton;

    public SingletonValidatorThread(ThreadSafeSingleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public void run() {
        if(singleton != ThreadSafeSingleton.getInstance()){
            System.out.println("Singleton failed ..!!!");
        }
    }
}