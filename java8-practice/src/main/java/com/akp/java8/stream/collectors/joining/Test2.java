package com.akp.java8.stream.collectors.joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's');

		String chString = ch.stream()
				.map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(chString);
	}
}