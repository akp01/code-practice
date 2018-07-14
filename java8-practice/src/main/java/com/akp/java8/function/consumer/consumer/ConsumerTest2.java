package com.akp.java8.function.consumer.consumer;

import java.util.function.Consumer;

public class ConsumerTest2 {

	public static void main(String[] args) {
		Consumer<String> consumerStr = s -> {
			System.out.println(s);
			System.out.println("Hello" + s);
		};
		// Consumer<String> consumerStr1 = System.out::println;
		consumerStr.accept("Hello Java.");
		consumeString(consumerStr, "Hello World.");

		Consumer<Integer> consumerInt = i -> {
			System.out.println("Integer value=" + i);
		};
		consumerInt.accept(5);
		consumeInteger(consumerInt);
	}

	private static void consumeString(Consumer<String> consumerStr, final String value) {
		consumerStr.accept(value);
	}
	
	private static void consumeInteger(Consumer<Integer> consumerInt) {
		consumerInt.accept(8);
	}
}
