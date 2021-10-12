package com.basics.arrays.assignment1.singleton;

public class DoubleCheckLazyInitializationSingleton {
	private static DoubleCheckLazyInitializationSingleton instance = null;

	private DoubleCheckLazyInitializationSingleton() {

	}

	public static DoubleCheckLazyInitializationSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLazyInitializationSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckLazyInitializationSingleton();
				}
			}
		}
		return instance;
	}
}
