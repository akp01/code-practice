package com.akp.java8.common;

import java.math.BigDecimal;

public class Developer {

	private String name;
	private BigDecimal salary;
	private int age;

	public Developer(final String name, final BigDecimal salary, final int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Developer(final String name, final int age, final BigDecimal salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
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
		builder.append("Developer [name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

}
