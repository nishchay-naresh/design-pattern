package com.nishchay.dp.creational.singleton;

public class EagerLoadingSingleton {

    private static EagerLoadingSingleton instance;

    private EagerLoadingSingleton() {
    }

    static {
        try {
            instance = new EagerLoadingSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static EagerLoadingSingleton getInstance() {
        return instance;
    }

}
