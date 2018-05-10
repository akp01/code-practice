package com.akp.java8.sample;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class Sample {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		// get, in uppercase, the names of all female older than 18
		final List<String> names = new ArrayList<>();
		for (final Person person : people) {
			if (person.getGender() == Gender.FEMALE && person.getAge() > 18) {
				names.add(person.getName().toUpperCase());
			}
		}

		System.out.println(names);

		// The above mixes what with how - sequential, one element at a time. Details
		// all thrown together.
		// imperative in nature - mutability and low level details
		// We are focused on each element

		// Let's use Streams instead
		System.out.println(people.stream().filter(person -> person.getGender() == Gender.FEMALE)
				.filter(person -> person.getAge() > 18).map(person -> person.getName().toUpperCase())
				.collect(toList()));

		// we said what, not how, may be sequential, lazy, parallel, etc.
		// functional and declarative in nature - no explicit mutation and higher level
		// of abstraction
		// focus on the whole collection instead of fiddling with iteration and each
		// element.
	}
}
