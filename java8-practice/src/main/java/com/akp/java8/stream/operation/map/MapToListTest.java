package com.akp.java8.stream.operation.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListTest {

	public static void main(final String[] args) {
		final Map<Integer, String> map = new HashMap<>();
		map.put(10, "apple");
		map.put(20, "orange");
		map.put(30, "banana");
		map.put(40, "watermelon");
		map.put(50, "dragonfruit");

		System.out.println("\n1. Export Map Key to List...");

		final List<Integer> result = new ArrayList(map.keySet());

		result.forEach(System.out::println);

		System.out.println("\n2. Export Map Value to List...");

		final List<String> result2 = new ArrayList(map.values());

		result2.forEach(System.out::println);

		System.out.println("\n1. Export Map Key to List...");

		final List<Integer> result3 = map.keySet().stream().collect(Collectors.toList());

		result3.forEach(System.out::println);

		System.out.println("\n2. Export Map Value to List...");

		final List<String> result4 = map.values().stream().collect(Collectors.toList());

		result4.forEach(System.out::println);

		System.out.println("\n3. Export Map Value to List..., say no to banana");
		final List<String> result5 = map.values().stream().filter(x -> !"banana".equalsIgnoreCase(x))
				.collect(Collectors.toList());

		result5.forEach(System.out::println);

		// split a map into 2 List
		final List<Integer> resultSortedKey = new ArrayList<>();
		final List<String> resultValues = map.entrySet().stream()
				// sort a Map by key and stored in resultSortedKey
				.sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
				.peek(e -> resultSortedKey.add(e.getKey())).map(x -> x.getValue())
				// filter banana and return it to resultValues
				.filter(x -> !"banana".equalsIgnoreCase(x)).collect(Collectors.toList());

		resultSortedKey.forEach(System.out::println);
		resultValues.forEach(System.out::println);

	}
}
