package com.nishchay.dp.creational.singleton;
/*
* Designing a thread safe singleton class using DCL - Double check locking
*
* */

import java.io.Serializable;

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

	protected Object readResolve() {
		return getInstance();
	}

	// guard against cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
