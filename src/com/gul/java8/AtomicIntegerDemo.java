package com.gul.java8;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

	public static void main(String args[]) {

		// Initially value as 0
		AtomicInteger val = new AtomicInteger(10);

		// Decreases and gets
		// the previous value
		int res = val.getAndIncrement();

		System.out.println("Previous value: " + res);

		// Prints the updated value
		System.out.println("Current value: " + val);
	}
}
