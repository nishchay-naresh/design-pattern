package com.nishchay.dp.creational.singleton.lazy;


/*
 *  Singleton using a static holder pattern
 *      safe initialization and lazy loading handled by JVM
 *
 * Qn - why the Bill Pugh Singleton is lazy-loaded, even though the instance is in a static variable.
 * The inner static class is not loaded until it is referenced ( means Holder.INSTANCE not accessed). This is the entire reason the pattern is lazy-loaded.
 * Outer class (Singleton) gets loaded first. Inner static class (Holder) is loaded ONLY when it is first accessed.
 *
 * -	Holder class loads only when getInstance() is called
 * -	Class loading is thread-safe by JVM spec, Static initialization happens only once
 * -	No locks used
 * -	No volatile needed
 * */
public class SingletonBillPugh {

    private SingletonBillPugh() {
        if (Holder.INSTANCE != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
