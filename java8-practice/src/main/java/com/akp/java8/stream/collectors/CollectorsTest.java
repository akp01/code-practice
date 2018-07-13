package com.akp.java8.stream.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;	

public class CollectorsTest {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("a", "bb", "ccc", "dd");
		
		// Collectors.toList()
		toList(stringList);
		
		// Collectors.toSet()
		toSet(stringList);
		
		// Collectors.toCollection()
		toCollection(stringList);
				  
		// Collectors.toMap()
		toMap(stringList);
		
		// Collectors.collectingAndThen()
		collectingAndThen(stringList);
		
		// Collectors.joining()
		joining(stringList);
		
		// Collectors.counting()
		counting(stringList);
		
		// Collectors.summarizingDouble/Long/Int()
		summarizingDouble(stringList);
		
		// Collectors.averagingDouble/Long/Int()
		averagingDouble(stringList);
		
		// Collectors.summingDouble/Long/Int()
		summingDouble(stringList);
		
		// Collectors.maxBy()/minBy()
		maxBy(stringList);
		
		// Collectors.groupingBy()
		groupingBy(stringList);
		
		// Collectors.partitioningBy()
		partitioningBy(stringList);
	}
	
	private static void toList(List<String> stringList) {
		List<String> result = stringList.stream().collect(Collectors.toList());
		result.stream().forEach(System.out::println);
	}
	
	private static void toSet(List<String> stringList) {
		Set<String> result1 = stringList.stream().collect(Collectors.toSet());
		result1.stream().forEach(System.out::println);
	}
	
	private static void toCollection(List<String> stringList) {
		List<String> result2= stringList.stream()
				  .collect(Collectors.toCollection(LinkedList::new));
	}
	
	private static void toMap(List<String> stringList) {
		Map<String, Integer> result3 = stringList.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println("Print Map entries : ");
		Map<String, Integer> result4= stringList.stream()
				  .collect(Collectors.toMap(Function.identity(), String::length, (i1, i2) -> i1));
		result4.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		System.out.println("Print Map entry set values : ");
		result4.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "/" + e.getValue()));
		
		System.out.println("Print Map key values using values : ");
		result4.keySet().forEach(System.out::println);
		result4.values().forEach(System.out::println);
	}

	
	
	
	
	
	

	private static void partitioningBy(List<String> stringList) {
		Map<Boolean, List<String>> result15 = stringList.stream()
				  .collect(Collectors.partitioningBy(s -> s.length() > 2));
	}

	private static void groupingBy(List<String> stringList) {
		Map<Integer, Set<String>> result14 = stringList.stream()
				  .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
	}

	private static void maxBy(List<String> stringList) {
		Optional<String> result13 = stringList.stream()
				  .collect(Collectors.maxBy(Comparator.naturalOrder()));
	}

	private static void summingDouble(List<String> stringList) {
		Double result12 = stringList.stream()
				  .collect(Collectors.summingDouble(String::length));
	}

	private static void averagingDouble(List<String> stringList) {
		Double result11 = stringList.stream()
				  .collect(Collectors.averagingDouble(String::length));
	}

	private static void summarizingDouble(List<String> stringList) {
		DoubleSummaryStatistics result10 = stringList.stream()
				  .collect(Collectors.summarizingDouble(String::length));
	}

	private static void counting(List<String> stringList) {
		Long result9 = stringList.stream()
				  .collect(Collectors.counting());
	}

	private static void joining(List<String> stringList) {
		String result6 = stringList.stream()
				  .collect(Collectors.joining());
		
		String result7 = stringList.stream()
				  .collect(Collectors.joining(" "));
		
		String result8 = stringList.stream()
				  .collect(Collectors.joining(" ", "PRE-", "-POST"));
	}

	private static void collectingAndThen(List<String> stringList) {
		List<String> result5 = stringList.stream()
				  .collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableList::copyOf));
	}

	

	

	

}
