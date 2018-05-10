package com.akp.java8.stream.operation.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {

	public static void main(final String[] args) {
		final Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		// Normal way to loop a Map.
		for (final Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		// Loop a Map with forEach + lambda expression.
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});

		// Normal for-loop to loop a List
		final List<String> items1 = new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");

		for (final String item : items1) {
			System.out.println(item);
		}

		// Loop a List with forEach + lambda expression or method reference.
		// lambda
		// Output : A,B,C,D,E
		items1.forEach(item -> System.out.println(item));

		// Output : C
		items1.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		items1.forEach(System.out::println);

		// Stream and filter
		// Output : B
		items1.stream().filter(s -> s.contains("B")).forEach(System.out::println);
	}

}
