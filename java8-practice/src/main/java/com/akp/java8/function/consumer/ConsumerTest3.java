package com.akp.java8.function.consumer;

import java.util.function.Consumer;

public class ConsumerTest3 {

	public static void main(String[] args) {
		Consumer<String> consumer1 = s -> {
			System.out.println(s + " World ");
		};
		Consumer<String> consumer2 = s -> {
			System.out.println(s + " Java ");
		};

		Consumer<String> consumer3 = s -> {
			System.out.println(s + " 8.");
		};

		// Using andThen method
		consumer1.andThen(consumer2).andThen(consumer3).accept("Hello");
	}
}
