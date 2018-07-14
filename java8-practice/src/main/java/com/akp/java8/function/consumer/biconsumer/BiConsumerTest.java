package com.akp.java8.function.consumer.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		// Test 1
		BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
		map.forEach(biConsumer);

		// Test 2
		BiConsumer<Integer, String> consumer = (a, b) -> {
			System.out.println(a + b);
		};
		consumer.accept(5, " Chapters");

		// Test 3
		BiConsumer<Integer, Integer> addition = (a, b) -> {
			System.out.println(a + b);
		};

		// Test 4
		BiConsumer<Integer, Integer> subtraction = (a, b) -> {
			System.out.println(a - b);
		};
		
		// Using andThen()
		addition.andThen(subtraction).accept(10, 6);

	}

}
