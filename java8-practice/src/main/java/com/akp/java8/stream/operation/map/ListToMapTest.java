package com.akp.java8.stream.operation.map;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class ListToMapTest {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 32));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		// Create a Map with key as name and value as Person Object
		final Map<String, Person> peopleWithNameAgeAsKey = people.stream()
				.collect(toMap(person -> person.getName() + ":" + person.getAge(), person -> person));

		peopleWithNameAgeAsKey.forEach((key, value) -> System.out.println(key + " --> " + value));
	}
}
