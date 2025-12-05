package com.nishchay.dp.creational.singleton.lazy;


/*
 *
 * -	Holder class loads only when getInstance() is called
 * -	Class loading is thread-safe by JVM spec
 * -	No locks used
 * -	No volatile needed
 *
 * */
public class SingletonBillPugh {

    private SingletonBillPugh() {
    }

    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
