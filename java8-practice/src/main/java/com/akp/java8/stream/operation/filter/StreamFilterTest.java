package com.akp.java8.stream.operation.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.akp.java8.common.Employee;

public class StreamFilterTest {

	public static void main(final String[] args) {

		// Streams filter() and collect()
		final List<String> lines = Arrays.asList("spring", "node", "java");

		final List<Employee> employees = Arrays.asList(new Employee("java", 30), new Employee("Ramesh", 20),
				new Employee("Suresh", 40));

		final List<String> result = getFilterOutput(lines, "java");

		for (final String temp : result) {
			System.out.println(temp);
		}

		// Stream.filter() to filter a List, and collect() to convert a stream into a
		// List
		final List<String> result1 = lines.stream().filter(line -> !"java".equals(line)).collect(Collectors.toList());

		result1.forEach(System.out::println);

		// Streams filter(), findAny() and orElse()
		final Employee result2 = getStudentByName(employees, "Ramesh");
		System.out.println(result2);

		// Use stream.filter() to filter a List, and .findAny().orElse (null) to return
		// an object conditional
		final Employee result3 = employees.stream().filter(x -> "Ramesh".equals(x.getName())).findAny().orElse(null);

		System.out.println(result3);

		final Employee result4 = employees.stream().filter(x -> "Ashok".equals(x.getName())).findAny().orElse(null);

		System.out.println(result4);

		// For multiple condition.
		final Employee result5 = employees.stream().filter((p) -> "Ramesh".equals(p.getName()) && 20 == p.getAge())
				.findAny().orElse(null);

		System.out.println("result 5 :" + result5);

		// or like this
		final Employee result6 = employees.stream().filter(p -> {
			if ("Ramesh".equals(p.getName()) && 20 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("result 6 :" + result6);

		// Streams filter() and map()
		final String name = employees.stream().filter(x -> "Ramesh".equals(x.getName())).map(Employee::getName)
				.findAny().orElse("");

		System.out.println("name : " + name);

		final List<String> collect = employees.stream().map(Employee::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

	private static List<String> getFilterOutput(final List<String> lines, final String filter) {
		final List<String> result = new ArrayList<>();
		for (final String line : lines) {
			if (!"java".equals(line)) {
				result.add(line);
			}
		}
		return result;
	}

	private static Employee getStudentByName(final List<Employee> employees, final String name) {
		Employee result = null;
		for (final Employee temp : employees) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}

}
