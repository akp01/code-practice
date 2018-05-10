package com.akp.java8.sorting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.akp.java8.common.Developer;

public class SortingTest {
	public static void main(final String[] args) {
		sorting();
	}

	private static void sorting() {
		final List<Developer> developers = getDevelopers();
		sortByJava7(developers);
		sortByJava8(developers);
	}

	private static void sortByJava7(final List<Developer> developers) {

		// sort by age
		printWithComment(developers, "Before Sort");
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(final Developer o1, final Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		printWithComment(developers, "After Sort");

		//sort by name
		printWithComment(developers, "Before Sort");
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(final Developer o1, final Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		printWithComment(developers, "After Sort");

		//sort by salary
		printWithComment(developers, "Before Sort");
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(final Developer o1, final Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
		printWithComment(developers, "After Sort");
	}
	
	private static void sortByJava8(final List<Developer> developers) {
		printWithComment(developers, "Before Sort using java 8 :: ");

		System.out.println("After Sort using java 8 :: ");

		// lambda here!
		developers.sort((final Developer o1, final Developer o2) -> o1.getAge() - o2.getAge());

		// java 8 only, lambda also, to print the List
		developers.forEach((developer) -> System.out.println(developer));
		developers.forEach(System.out::println);

		// sort by age
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		// lambda
		developers.sort((final Developer o1, final Developer o2) -> o1.getAge() - o2.getAge());

		// lambda, valid, parameter type is optional
		developers.sort((o1, o2) -> o1.getAge() - o2.getAge());

		// sort by name
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		// lambda
		developers.sort((final Developer o1, final Developer o2) -> o1.getName().compareTo(o2.getName()));

		// lambda
		developers.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

		// sort by salary
		Collections.sort(developers, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});

		// lambda
		developers.sort((final Developer o1, final Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));

		// lambda
		developers.sort((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

		// Reversed sorting
		// Lambda expression to sort a List using their salary.
		final Comparator<Developer> salaryComparator1 = (o1, o2) -> o1.getSalary().compareTo(o2.getSalary());
		developers.sort(salaryComparator1);
		printWithComment(developers, "sort a List using their salary");

		// Lambda expression to sort a List using their salary, reversed order.
		Comparator<Developer> salaryComparator = (o1, o2)->o1.getSalary().compareTo(o2.getSalary());
		developers.sort(salaryComparator.reversed());
		printWithComment(developers, "sort a List using their salary, reversed order");
	}

	private static void printWithComment(final List<Developer> developers, final String comment) {
		System.out.println(comment);
		printWithoutComment(developers);
	}

	private static void printWithoutComment(final List<Developer> developers) {
		for (final Developer developer : developers) {
			System.out.println(developer);
		}
	}
	
	private static List<Developer> getDevelopers() {
		final List<Developer> result = new ArrayList<>();
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		return result;
	}
}
