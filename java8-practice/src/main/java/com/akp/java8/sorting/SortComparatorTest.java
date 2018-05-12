package com.akp.java8.sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.akp.java8.common.Gender;
import com.akp.java8.common.Person;

public class SortComparatorTest {
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(final String[] args) {
		final List<Person> people = createPeople();

		System.out.println("---------------");
		people.stream().sorted((person1, person2) -> person1.getAge() > person2.getAge() ? 1 : -1)
				.forEach(System.out::println);

		System.out.println("---------------");
		final Function<Person, Integer> byAge = Person::getAge;
		people.stream().sorted(Comparator.comparing(byAge)).forEach(System.out::println);

		System.out.println("---------------");
		final Function<Person, String> byName = Person::getName;
		people.stream().sorted(Comparator.comparing(byAge).thenComparing(byName)).forEach(System.out::println);
	}
}
