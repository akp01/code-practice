package com.akp.java8.function.predicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, String> condition = (i, s) -> i > 20 && s.startsWith("R");
		System.out.println(condition.test(10, "Ram"));
		System.out.println(condition.test(30, "Shyam"));
		System.out.println(condition.test(30, "Ram"));

		// 2
		BiPredicate<String, String> predicate = (s1, s2) -> (s1.equals(s2));

		System.out.println(predicate.test("BORAJI", "BORAJI"));
		System.out.println(predicate.test("JAVA", "BORAJI"));

		// 3
		BiPredicate<Long, Long> predicate1 = (x, y) -> x > y;
		BiPredicate<Long, Long> predicate2 = (x, y) -> x == y;

		// Using and()
		System.out.println(predicate1.and(predicate2).test(5l, 5l));

		// Using or()
		System.out.println(predicate1.or(predicate2).test(6l, 5l));

		// Using negate()
		System.out.println(predicate1.negate().test(8l, 1l));

	}

}
