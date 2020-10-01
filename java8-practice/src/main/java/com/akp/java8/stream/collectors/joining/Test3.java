package com.akp.java8.stream.collectors.joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Geeks", "for", "Geeks");

		String chString = str.stream()
				.map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(chString);
	}
}
