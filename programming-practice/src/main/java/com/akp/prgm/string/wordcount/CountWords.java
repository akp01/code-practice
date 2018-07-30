package com.akp.prgm.string.wordcount;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;
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
		countWords(Arrays.stream(inputStr.split(" ")));
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

}
