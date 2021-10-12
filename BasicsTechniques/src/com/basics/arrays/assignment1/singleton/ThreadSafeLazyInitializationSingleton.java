package com.basics.arrays.assignment1.singleton;

public class ThreadSafeLazyInitializationSingleton {

	private static ThreadSafeLazyInitializationSingleton instance=null;
	
	private ThreadSafeLazyInitializationSingleton() {
		
	}
	
	public static synchronized ThreadSafeLazyInitializationSingleton getInstance() {
		if(instance==null) {
			instance=new ThreadSafeLazyInitializationSingleton();
		}
		return instance;
	}
	
}
