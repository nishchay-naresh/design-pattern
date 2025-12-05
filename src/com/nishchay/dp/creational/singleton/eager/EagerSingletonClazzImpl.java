package com.nishchay.dp.creational.singleton.eager;

public class EagerSingletonClazzImpl {

    private static final EagerSingletonClazzImpl instance;

    private EagerSingletonClazzImpl() {
    }

    static {
        try {
            instance = new EagerSingletonClazzImpl();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static EagerSingletonClazzImpl getInstance() {
        return instance;
    }

}
