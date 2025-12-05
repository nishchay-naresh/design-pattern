package com.nishchay.dp.creational.singleton;

import com.nishchay.dp.creational.singleton.lazy.SingletonThreadSafe;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) {
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
}
/*
 * O/P =>
 * instance1.hashCode():- 356573597
 * instance2.hashCode():- 1735600054
 *
 * instance1.hashCode():- 1808253012
 * instance2.hashCode():- 589431969
 * */