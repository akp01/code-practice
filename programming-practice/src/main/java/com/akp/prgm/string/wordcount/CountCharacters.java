package com.akp.prgm.string.wordcount;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

/**
 * Count number of characters in a sentence.
 * 
 * @author akp
 *
 */
public class CountCharacters {

	public static void main(String[] args) {
		String inputStr = "Sun rises in the east and sets in west. Early to bed early to rise.";
		//countCharacters1(inputStr);
		countChars(inputStr);
	}

	private static void countCharacters1(String inputStr) {
		Map<String, Long> map = Arrays.stream(inputStr.split("")).collect(groupingBy(Function.identity(), counting()));
		// Map<String, Long> map = Arrays.stream(inputStr.split("")).collect(groupingBy(name -> name,counting()));
		map.forEach((k, v) -> {
			if (!k.trim().isEmpty()) {
				System.out.println(k + ":" + v);
			}
		});
	}

	// Count Characters irrespective of case
	private static void countChars(String inputStr) {
		Arrays.stream(inputStr.split(""))
		.sorted()
		.filter(e -> e.trim().length() > 0)
		.filter(e-> !e.equals("."))
		.map(String::toUpperCase)
		.collect(groupingBy(Function.identity(), counting()))
		.forEach((k, v) -> System.out.println(k + " : " + v));

	}
}
