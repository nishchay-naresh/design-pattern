package com.nishchay.dp.creational.singleton;

public class SingletonValidatorThread1 implements Runnable {

    BillPughSingleton singleton;

    public SingletonValidatorThread1(BillPughSingleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public void run() {
        if(singleton != BillPughSingleton.getInstance()){
            System.out.println("Singleton failed ..!!!");
        }
    }
}