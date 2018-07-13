package com.akp.java8.stream.collectors;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListOfUserObject {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(23, "Mahesh");
		map.put(10, "Suresh");
		map.put(26, "Dinesh");
		map.put(11, "Kamlesh");

		List<Person> list = map.entrySet().stream()
				.sorted(Comparator.comparing(e -> e.getKey()))
				.map(e -> new Person(e.getKey(), e.getValue()))
				.collect(Collectors.toList());

		list.forEach(l -> System.out.println("Id: " + l.getId() + ", Name: " + l.getName()));
	}
}

class Person {
	private Integer id;
	private String name;

	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}