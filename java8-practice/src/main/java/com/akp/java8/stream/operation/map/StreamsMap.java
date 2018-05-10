package com.akp.java8.stream.operation.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.akp.java8.common.Student;
import com.akp.java8.common.StudentPublic;

public class StreamsMap {

	public static void main(final String[] args) {
		streamsMap();
	}

	public static void streamsMap() {
		final List<String> alpha = Arrays.asList("a", "b", "c", "d");

		// Before Java8
		final List<String> alphaUpper = new ArrayList<>();
		for (final String s : alpha) {
			alphaUpper.add(s.toUpperCase());
		}

		System.out.println(alpha); // [a, b, c, d]
		System.out.println(alphaUpper); // [A, B, C, D]

		// Java 8
		final List<String> collect = alpha.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(collect); // [A, B, C, D]

		// Extra, streams apply to any data type.
		final List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		final List<Integer> collect1 = num.stream()
				.map(n -> n * 2)
				.collect(Collectors.toList());
		System.out.println(collect1); // [2, 4, 6, 8, 10]

		// List of objects -> List of String
		final List<Student> staff = Arrays.asList(
				new Student("Rajesh", 30, new BigDecimal(10000)),
				new Student("Ramesh", 27, new BigDecimal(20000)), 
				new Student("Ashok", 33, new BigDecimal(30000)));

		// Before Java 8
		final List<String> result = new ArrayList<>();
		for (final Student x : staff) {
			result.add(x.getName());
		}
		System.out.println(result); // [Rajesh, Ramesh, Ashok]

		// Java 8
		final List<String> collect2 = staff.stream()
				.map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(collect2); // [Rajesh, Ramesh, Ashok]

		// Before Java 8.
		final List<StudentPublic> result1 = convertToStaffPublic(staff);
		System.out.println(result1);

		// Java 8 example
		// convert inside the map() method directly.
		final List<StudentPublic> result2 = staff.stream()
				.map(temp -> {
					final StudentPublic obj = new StudentPublic();
					obj.setName(temp.getName());
					obj.setAge(temp.getAge());
					
					if ("Rajesh".equals(temp.getName())) {
						obj.setExtra("this field is for Rajesh only!");
					}
					return obj; })
				.collect(Collectors.toList());

		System.out.println(result2);
	}

	private static List<StudentPublic> convertToStaffPublic(final List<Student> staff) {
		final List<StudentPublic> result = new ArrayList<>();

		for (final Student temp : staff) {
			final StudentPublic obj = new StudentPublic();
			obj.setName(temp.getName());
			obj.setAge(temp.getAge());
			if ("Rajesh".equals(temp.getName())) {
				obj.setExtra("this field is for Rajesh only!");
			}
			result.add(obj);
		}
		return result;
	}
}
