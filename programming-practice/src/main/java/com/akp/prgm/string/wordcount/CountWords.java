package com.akp.prgm.string.wordcount;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Count number of words in a sentence.
 * 
 * @author akp
 *
 */
public class CountWords {

	public static void main(String[] args) {
		String inputStr = "Sun rises in the east and sets in west";
		//countWords(Arrays.stream(inputStr.split(" ")));
		countWords1(inputStr);
	}

	public static Map<String, Long> countWords(Stream<String> names) {
		Map<String, Long> map = names.collect(groupingBy(name -> name, counting()));

		map.forEach((k, v) -> {
			if (!k.trim().isEmpty()) {
				System.out.println(k + ":" + v);
			}
		});

		return map;
	}
	
	// Count Characters irrespective of case
		private static void countWords1(String inputStr) {
			Arrays.stream(inputStr.split(" "))
			.sorted()
			.filter(e -> e.trim().length() > 0)
			.filter(e-> !e.equals("."))
			.map(String::toUpperCase)
			.collect(groupingBy(Function.identity(), counting()))
			.forEach((k, v) -> System.out.println(k + " : " + v));

		}

}
