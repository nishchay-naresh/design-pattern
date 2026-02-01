package com.nishchay.dp.creational.singleton;

import com.nishchay.dp.creational.singleton.lazy.SingletonThreadSafe;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) {
        getInstanceThenReflection();
        System.out.println("......................");
        reflectionThenGetInstance();
    }


    private static void getInstanceThenReflection() {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();

        SingletonThreadSafe instance2 = null;
        try {
            Constructor<SingletonThreadSafe> constructor = SingletonThreadSafe.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- " + instance1.hashCode());
        assert instance2 != null;
        System.out.println("instance2.hashCode():- " + instance2.hashCode());
    }

    /*
     * “The constructor guard prevents reflection from creating a second instance by throwing an exception if the singleton instance already exists.”
     * Edge Case: Reflection Before getInstance() -> If someone uses reflection before getInstance(), Guard does NOT stop this.
     * */
    private static void reflectionThenGetInstance() {
        SingletonThreadSafe instance1 = null;
        try {
            Constructor<SingletonThreadSafe> constructor = SingletonThreadSafe.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance1 = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        assert instance1 != null;
        System.out.println("instance1.hashCode():- " + instance1.hashCode());
        System.out.println("instance2.hashCode():- " + instance2.hashCode());
    }
}

/*
 * O/P =>
 * instance1.hashCode():- 1808253012
 * instance2.hashCode():- 589431969
 * .........................................
 * java.lang.reflect.InvocationTargetException
 * Caused by: java.lang.RuntimeException: Use getInstance()
 * Exception in thread "main" java.lang.NullPointerException
 *
 * */