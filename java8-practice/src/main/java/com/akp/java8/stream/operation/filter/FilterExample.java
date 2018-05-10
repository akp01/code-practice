package com.akp.java8.stream.operation.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(final String[] args) {
		final List<String> inputs = Arrays.asList("abc", "xyz", "mnc");

		filterOutput_java7(inputs, "mnc");

		System.out.println(" ");

		filterOutput_java8(inputs, "mnc");
	}

	private static void filterOutput_java7(final List<String> inputs, final String filter) {
		final List<String> result = new ArrayList<>();
		for (final String line : inputs) {
			if (!filter.equals(line)) {
				result.add(line);
			}
		}

		System.out.println("Java 7 Out put :: ");
		for (final String temp : result) {
			System.out.println(temp); // output : spring, node
		}
	}

	private static void filterOutput_java8(final List<String> inputs, final String filterValue) {

		final List<String> result = inputs.stream().filter(line -> !filterValue.equals(line))
				.collect(Collectors.toList());

		System.out.println("Java 8 Out put :: ");
		result.forEach(System.out::println);
	}

}
