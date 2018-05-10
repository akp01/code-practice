package com.akp.java8.stream.operation.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.akp.java8.common.Employee;

public class FilterEmployee {

	public static void main(final String[] args) {

		final List<Employee> employees = Arrays.asList(new Employee("Rakesh", 30), new Employee("Suresh", 20),
				new Employee("Ramesh", 40));

		System.out.println("With Java 7 Features :: ");
		System.out.println("");

		final Employee result = getStudentByName(employees, "Suresh");
		System.out.println(result);

		System.out.println("");
		System.out.println("With Java 8 Features :: ");
		System.out.println("");

		// The equivalent example in Java 8, use stream.filter() to filter a List, and
		// .findAny().orElse (null) to return an object conditional.
		final Employee result1 = employees.stream().filter(x -> "Suresh".equals(x.getName())).findAny().orElse(null);
		final Employee resultNew = employees.stream().filter(e -> e.getAge() > 25).findFirst().orElse(null);

		System.out.println("  New Result age: " + resultNew.getAge());
		System.out.println(result1);

		final Employee result2 = employees.stream().filter(x -> "John".equals(x.getName())).findAny().orElse(null);

		System.out.println(result2);

		// For multiple condition
		final Employee result3 = employees.stream().filter((p) -> "Suresh".equals(p.getName()) && 20 == p.getAge())
				.findAny().orElse(null);

		System.out.println("result 3 :" + result3);

		// or like this
		final Employee result4 = employees.stream().filter(p -> {
			if ("Suresh".equals(p.getName()) && 20 == p.getAge()) {
				return true;
			}
			return false;
		}).findAny().orElse(null);

		System.out.println("result 4 :" + result4);

		// Streams filter() and map()
		final String name = employees.stream().filter(x -> "jack".equals(x.getName())).map(Employee::getName).findAny()
				.orElse("");

		System.out.println("name : " + name);

		final List<String> collect = employees.stream().map(Employee::getName).collect(Collectors.toList());

		collect.forEach(System.out::println);
	}

	private static Employee getStudentByName(final List<Employee> Employees, final String name) {
		Employee result = null;
		for (final Employee temp : Employees) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}
}
