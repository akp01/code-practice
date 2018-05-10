package com.akp.java8.stream.operation.map;

import java.util.Arrays;
import java.util.List;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class TestMap {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 22));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		// print all males, but with name in uppercase
		people.stream().filter(person -> person.getGender() == Gender.MALE)
				.map(person -> new Person(person.getName().toUpperCase(), person.getGender(), person.getAge()))
				.forEach(System.out::println);

		// the original list is still intact
		System.out.println(people);
	}
}
