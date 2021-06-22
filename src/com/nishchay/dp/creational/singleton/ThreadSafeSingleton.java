package com.nishchay.dp.creational.singleton;

import java.io.Serializable;

/*
 * Designing a thread safe singleton class using DCL - Double check locking
 * then again guarding it against -  cloning & Serialization concepts
 * */
public class ThreadSafeSingleton implements Serializable, Cloneable{

	private static volatile ThreadSafeSingleton instance = null;

	private ThreadSafeSingleton() {
	}

	// writing getInstance method using double check locking
	public static ThreadSafeSingleton getInstance(){
	    if(instance == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingleton();
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
