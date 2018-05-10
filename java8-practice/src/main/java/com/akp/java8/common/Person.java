package com.akp.java8.common;

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