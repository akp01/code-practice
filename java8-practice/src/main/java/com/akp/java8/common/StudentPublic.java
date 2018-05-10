package com.akp.java8.common;

public class StudentPublic {
	private String name;
	private int age;
	private String extra;

	public StudentPublic() {
		super();
	}

	public StudentPublic(final String name, final int age, final String extra) {
		super();
		this.name = name;
		this.age = age;
		this.extra = extra;
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

	public String getExtra() {
		return extra;
	}

	public void setExtra(final String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("StaffPublic [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", extra=");
		builder.append(extra);
		builder.append("]");
		return builder.toString();
	}

}
