package com.akp.java8.stream.collectors.groupingby;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class GroupingByTest {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		final Map<Integer, List<Person>> peopleByAgeAsKey = people.stream().collect(groupingBy(Person::getAge));

		System.out.println(peopleByAgeAsKey);

		System.out.println(people.stream().collect(groupingBy(Person::getName)));

		final Map<String, List<Person>> personByNameMap = people.stream().collect(groupingBy(Person::getName));

		final Map<String, List<Integer>> personByAge = people.stream()
				.collect(groupingBy(Person::getName, mapping(Person::getAge, toList())));

		System.out.println(people.stream().collect(groupingBy(person -> person.getName().charAt(0))));
	}
}
