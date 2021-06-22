package com.nishchay.dp.creational.singleton;

import java.lang.reflect.Constructor;

public class SingletonBreakUsingReflection {

    public static void main(String[] args) {
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();

        ThreadSafeSingleton instance2 = null;
        try {
            Constructor constructor = ThreadSafeSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = (ThreadSafeSingleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- " + instance1.hashCode());
        System.out.println("instance2.hashCode():- " + instance2.hashCode());
    }
}
/*
 * O/P =>
 * instance1.hashCode():- 356573597
 * instance2.hashCode():- 1735600054
 *
 * */