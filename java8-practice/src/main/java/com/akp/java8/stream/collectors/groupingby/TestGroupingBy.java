package com.akp.java8.stream.collectors.groupingby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGroupingBy {
	public static void main(String[] args) {
		//3 apple, 2 banana, others 1
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
        
          // 1
        Map<String, Long> result = items.stream()
        		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        
        
		// 2
		Map<String, Long> result1 = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> finalMap = new LinkedHashMap<>();
		// Sort a map and add to finalMap
		result1.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
          
		
		//3 apple, 2 banana, others 1
        List<Item> items1 = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
          
		// 3
		Map<String, Long> counting = items1.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counting);

		Map<String, Integer> sum = items1.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(sum);
	        
		
		// 4
		// group by price
		Map<BigDecimal, List<Item>> groupByPriceMap = items1.stream().collect(Collectors.groupingBy(Item::getPrice));
		System.out.println(groupByPriceMap);

		// group by price, uses 'mapping' to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> result4 = items1.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
		System.out.println(result4);
	}
}
