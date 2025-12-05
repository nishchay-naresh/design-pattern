package com.nishchay.dp.creational.singleton.lazy;

import java.io.Serializable;

/*
 * ========================== Double Checked Locking + volatile =====================================
 *
 * Designing a thread safe singleton class using DCL - Double check locking
 * then again guarding it against - cloning & Serialization concepts
 *
 *  -	volatile ensures safe publication + prevents partial construction
 *  -    Lock is taken only once (when initializing)
 *
 *
 * ---------------------------------------------------------------------------------------
 * 	| Approach                         | Lazy Loaded? | Thread Safe? | Recommended?      |
 * 	| -------------------------------- | ------------ | ------------ | ----------------- |
 * 	| Bill Pugh Holder             	   | ✅ Yes       | ✅ Yes       | ⭐ BEST           |
 * 	| Double-Checked Locking (DCL) 	   | ✅ Yes       | ✅ Yes       | Good              |
 * 	| Enum Singleton               	   | ❌ No        | ✅ Yes       | Safe but not lazy |
 *
 * */
public class SingletonThreadSafe implements Serializable, Cloneable {

    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
    }

    // writing getInstance method using double check locking
    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    // guard against serialization
    protected Object readResolve() {
        return getInstance();
    }

    // guard against cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Unable to clone - Singleton class");
    }
}
