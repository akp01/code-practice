package com.akp.java8.stream.collectors.joining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's' };

		String chString = Stream.of(ch)
				.map(arr -> new String(arr))
				.collect(Collectors.joining());

		System.out.println(chString);
	}
}
