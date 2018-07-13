package com.akp.java8.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToList {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("a", "bb", "ccc", "dd");

		// Collectors.toList()
		List<String> result = stringList.stream().collect(Collectors.toList());
		result.stream().forEach(System.out::println);
		
        //Convert a Stream to List
		Stream<String> language = Stream.of("java", "python", "node");
        List<String> result1 = language.collect(Collectors.toList());
        result1.forEach(System.out::println);
        
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
        List<Integer> result2 = number.filter(x -> x!= 3).collect(Collectors.toList());
        result2.forEach(x -> System.out.println(x));
        
	}
}
