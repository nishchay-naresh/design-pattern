package com.nishchay.dp.creational.singleton.lazy;

import java.io.Serializable;

/*
 * ========================== Double Checked Locking + volatile =====================================
 *
 * Designing a thread safe singleton class using DCL - Double check locking
 * then again guarding it against - cloning & Serialization concepts
 *
 *  -	Volatile ensures safe publication + prevents partial construction
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
 * =====================================================================================================
 * 	What this implementation does RIGHT
 * 		-	Uses volatile -> fixes instruction reordering (Java 5+)
 * 		-	Double-checked locking -> avoids synchronization overhead, apply synchronization only during object creation
 * 		-	if (instance != null) check in constructor -> protects against reflection
 * 		-	readResolve() -> protects against serialization
 * 		-	clone() override -> protects against cloning
 * 		-	Lazy initialization
 * 		-	Good performance
 *
 * Explain when and why the second check (if(instance == null) inside synchronized) is needed - with a real thread scenario.
 *
 * After synchronization, we need another check, bucs many thread can pass the first check, gets blocks in to thread contention for lock in synchronization block
 * If we remove the double check, each blocked thread can create another copy of object upon getting its turn.
 *
 *
 * “The constructor guard prevents reflection from creating a second instance by throwing an exception if the singleton instance already exists.”
 * Edge Case: Reflection Before getInstance() -> If someone uses reflection before getInstance(), Guard does NOT stop this.
 * */
public class SingletonThreadSafe implements Serializable, Cloneable {

    private static volatile SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
        if (instance != null) // guard against reflection
            throw new RuntimeException("Use getInstance()");
    }

    public static SingletonThreadSafe getInstance() {

        // 1st check (no locking) — improves performance after initialization
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
