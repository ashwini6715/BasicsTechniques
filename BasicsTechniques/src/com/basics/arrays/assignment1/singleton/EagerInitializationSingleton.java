package com.basics.arrays.assignment1.singleton;

public class EagerInitializationSingleton {
	private static final EagerInitializationSingleton SINGLE_INSTANCE = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {

	}

	public static EagerInitializationSingleton getInstance() {
		return SINGLE_INSTANCE;
	}
}
