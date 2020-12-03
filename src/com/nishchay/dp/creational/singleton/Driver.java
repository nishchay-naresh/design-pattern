package com.nishchay.dp.creational.singleton;

public class Driver {

    public static void main(String[] args) {

//        validate_eagerLoadingSingleton();
        validate_threadSafeSingleton();
        validate_billPughSingleton();

    }




    private static void validate_eagerLoadingSingleton() {

        EagerLoadingSingleton singleton = EagerLoadingSingleton.getInstance();
        for (int i = 1; i <= 10; i++) {
            if(singleton == EagerLoadingSingleton.getInstance()){
                System.out.println("Singleton failed ..!!!");
            }
        }
    }


    private static void validate_threadSafeSingleton() {

        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        for (int i = 1; i <= 15; i++) {
            new Thread(new SingletonValidatorThread(singleton)).start();
        }

        try {
            ThreadSafeSingleton singleton1 = (ThreadSafeSingleton) singleton.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported for singletone");
            e.printStackTrace();
        }
    }


    private static void validate_billPughSingleton() {

        BillPughSingleton singleton = BillPughSingleton.getInstance();
        for (int i = 1; i <= 15; i++) {
            new Thread(new SingletonValidatorThread1(singleton)).start();
        }
    }



}

