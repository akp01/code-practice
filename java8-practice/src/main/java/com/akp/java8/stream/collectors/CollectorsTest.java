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
		List<String> result = stringList.stream().collect(Collectors.toList());
		result.stream().forEach(System.out::println);
		
		// Collectors.toSet()
		Set<String> result1 = stringList.stream().collect(Collectors.toSet());
		result1.stream().forEach(System.out::println);
		
		// Collectors.toCollection()
		List<String> result2= stringList.stream()
				  .collect(Collectors.toCollection(LinkedList::new));
				  
		// Collectors.toMap()
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
		
		// Collectors.collectingAndThen()
		List<String> result5 = stringList.stream()
				  .collect(Collectors.collectingAndThen(Collectors.toList(), ImmutableList::copyOf));
		
		// Collectors.joining()
		String result6 = stringList.stream()
				  .collect(Collectors.joining());
		
		String result7 = stringList.stream()
				  .collect(Collectors.joining(" "));
		
		String result8 = stringList.stream()
				  .collect(Collectors.joining(" ", "PRE-", "-POST"));
		
		
		// Collectors.counting()
		Long result9 = stringList.stream()
				  .collect(Collectors.counting());
		
		// Collectors.summarizingDouble/Long/Int()
		DoubleSummaryStatistics result10 = stringList.stream()
				  .collect(Collectors.summarizingDouble(String::length));
		
		// Collectors.averagingDouble/Long/Int()
		Double result11 = stringList.stream()
				  .collect(Collectors.averagingDouble(String::length));
		
		// Collectors.summingDouble/Long/Int()
		Double result12 = stringList.stream()
				  .collect(Collectors.summingDouble(String::length));
		
		// Collectors.maxBy()/minBy()
		Optional<String> result13 = stringList.stream()
				  .collect(Collectors.maxBy(Comparator.naturalOrder()));
		
		// Collectors.groupingBy()
		Map<Integer, Set<String>> result14 = stringList.stream()
				  .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		
		// Collectors.partitioningBy()
		Map<Boolean, List<String>> result15 = stringList.stream()
				  .collect(Collectors.partitioningBy(s -> s.length() > 2));
		

	}

}
