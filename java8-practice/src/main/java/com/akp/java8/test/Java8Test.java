package com.akp.java8.test;

import java.util.ArrayList;
import java.util.List;

public class Java8Test {

	public static void main(final String[] args) {
		final List<Person> persons = new ArrayList<>();

		// Person person1 = new Person("name", Gender.MALE, 32);

		/*
		 * persons.add(person1); persons.add(new Person("Sara", Gender.FEMALE, 22));
		 * persons.add(new Person("Bob", Gender.MALE, 20)); persons.add(new
		 * Person("Paula", Gender.FEMALE, 32)); persons.add(new Person("Paul",
		 * Gender.MALE, 32)); persons.add(new Person("Jack", Gender.MALE, 2));
		 * persons.add(new Person("Jack", Gender.MALE, 72)); persons.add(new
		 * Person("Jill", Gender.FEMALE, 12));
		 */
	}

	public enum Gender {
		MALE, FEMALE
	}

	public class Person {
		private final String name;
		private final Gender gender;
		private final int age;

		public Person(final String theName, final Gender theGender, final int theAge) {
			name = theName;
			gender = theGender;
			age = theAge;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public Gender getGender() {
			return gender;
		}

		@Override
		public String toString() {
			return String.format("%s -- %s -- %d", name, gender, age);
		}
	}

}