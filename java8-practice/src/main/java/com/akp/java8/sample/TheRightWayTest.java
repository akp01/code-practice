package com.akp.java8.sample;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class TheRightWayTest {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		// list of all adult names in uppercase
		final List<String> names = people.stream()
										 .filter(person -> person.getAge() > 17).map(Person::getName)
										 .map(String::toUpperCase)
										 .collect(() -> new ArrayList<>(), (list, name) -> list.add(name), (list1, list2) -> list1.addAll(list2));

		System.out.println(names);

		// Smelly, but illustrates some essential points.
		/*
		 * The collect takes three parameters: 1. Supplier - the initial value for the
		 * reduction 2. The accumulator - this takes an element and accumulates to the
		 * evolving result 3. The combiner - this is useful during parallel execution,
		 * this can take two partial results and combine into one.
		 */

		// Simplification
		final List<String> names2 = people.stream().filter(person -> person.getAge() > 17).map(Person::getName)
				.map(String::toUpperCase).collect(toList());

		System.out.println(names2);
	}
}
