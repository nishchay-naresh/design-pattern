package com.nishchay.dp.creational.singleton.eager;


/*
 * -  Prevents multiple instances
 * 		JVM ensures only one instance of each enum constant.
 * -  Automatically thread-safe
 * 		Enums are globally loaded once per JVM, safely.
 * -  Serialization-safe
 * 		No need for readResolve() — enums handle it internally.
 * -  Reflection-safe
 * 		Reflection cannot instantiate enum types: java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 * -  Simplest and smallest singleton code
 * 		No volatile, no locking, no complexity.
 *
 * */
public enum EagerSingletonEnumImpl {
    INSTANCE;   // Single instance of this enum

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void doSomething() {
        System.out.println("Singleton working...");
    }
}