package com.basics.arrays.assignment1.singleton;

public class LazyInitializationSingleton {

	private static LazyInitializationSingleton instance = null;

	private LazyInitializationSingleton() {

	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}
}
