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
		String inputStr = "Sun rises in the east and sets in west";
		countCharacters1(inputStr);
	}

	private static void countCharacters1(String inputStr) {
		Map<String, Long> map = Arrays.stream(inputStr.split("")).collect(groupingBy(Function.identity(), counting()));
		//Map<String, Long> map = Arrays.stream(inputStr.split("")).collect(groupingBy(name -> name, counting()));
		map.forEach((k, v) -> {
			if (!k.trim().isEmpty()) {
				System.out.println(k + ":" + v);
			}
		});
	}
}
