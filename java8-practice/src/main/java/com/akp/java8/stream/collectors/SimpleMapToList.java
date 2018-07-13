package com.akp.java8.stream.collectors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleMapToList {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(01, "ABC");
		map.put(02, "XYZ");
		map.put(03, "PLM");
		map.put(04, "LKJ");
		
		System.out.println("--Convert Map Values to List--");
		List<String> valueList = map.values().stream().collect(Collectors.toList());
		valueList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map Values to List using sort--");
		List<String> sortedValueList = map.values().stream().sorted().collect(Collectors.toList());
		sortedValueList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map keys to List--");
		List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
		keyList.forEach(n -> System.out.println(n));

		System.out.println("--Convert Map keys to List using sort--");
		List<Integer> sortedKeyList = map.keySet().stream().sorted().collect(Collectors.toList());
		sortedKeyList.forEach(n -> System.out.println(n));
	}
}
