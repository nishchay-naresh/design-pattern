package com.nishchay.dp.creational.singleton.eager;

public class Driver {

    public static void main(String[] args) {

        validate_eagerSingletonClazzImpl();
        validate_eagerSingletonEnumImpl();
    }

    private static void validate_eagerSingletonClazzImpl() {
        EagerSingletonClazzImpl singleton = EagerSingletonClazzImpl.getInstance();
        for (int i = 1; i <= 10; i++) {
            if(singleton != EagerSingletonClazzImpl.getInstance()){
                System.out.println("Singleton failed ..!!!");
            }
        }
        System.out.println("All 10 invocation of EagerlyLoadedClazzImpl.getInstance() gave me same instance");
    }

    private static void validate_eagerSingletonEnumImpl() {

        // Access the singleton
        EagerSingletonEnumImpl singleton1 = EagerSingletonEnumImpl.INSTANCE;
        EagerSingletonEnumImpl singleton2 = EagerSingletonEnumImpl.INSTANCE;

        // Same instance?
        System.out.println(singleton1 == singleton2); // true

        // Use methods
        singleton1.setValue(42);
        System.out.println(singleton2.getValue()); // 42 (same instance)

        singleton1.doSomething();
    }

}

