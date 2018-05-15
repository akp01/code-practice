package com.akp.cp.atomic;

public class SafeCounterWithLock {
	private volatile int value;

	int getValue() {
		return value;
	}

	synchronized void increment() {
		value++;
	}
}
