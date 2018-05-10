package com.akp.java8.common;

import java.math.BigDecimal;

public class Student {
	private String name;
	private int age;
	private BigDecimal salary;

	public Student(final String name, final int age, final BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(final BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Staff [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
