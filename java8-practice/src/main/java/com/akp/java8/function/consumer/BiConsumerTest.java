package com.akp.java8.function.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		// Test 1
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
		map.forEach(biConsumer);

		// 2
		BiConsumer<Integer, String> consumer = (a, b) -> {
			System.out.println(a + b);
		};
		consumer.accept(5, " Chapters");

		// 3
		BiConsumer<Integer, Integer> addition = (a, b) -> {
			System.out.println(a + b);
		};

		BiConsumer<Integer, Integer> subtraction = (a, b) -> {
			System.out.println(a - b);
		};
		// Using andThen()
		addition.andThen(subtraction).accept(10, 6);
		
	}

}
