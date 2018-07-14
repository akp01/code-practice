package com.akp.java8.function.function.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

	public static void main(final String[] args) {
		Function<Integer, Integer> add = x -> x + 1;
		System.out.println(add.apply(7));
		
		BiFunction<Integer, Integer, Integer> func = getValue();
		System.out.println(func.apply(5, 7));

		Function<Integer, Integer> add1 = x -> x + 1;
		System.out.println(add1.apply(12));

		Function<String, String> stringAdd = getStringValue();
		System.out.println(stringAdd.apply("10"));

		Function<String, String> concat = x -> x + 1;
		System.out.println(concat.apply("54"));
		
		System.out.println(multiply(x -> x + 3));

	}

	private static Function<String, String> getStringValue() {
		Function<String, String> stringAdd = x -> {
			String value = x + 1;
			return value;
		};
		return stringAdd;
	}

	private static BiFunction<Integer, Integer, Integer> getValue() {
		BiFunction<Integer, Integer, Integer> func = (x, y) -> {
			int a = x * y;
			return a;
		};
		return func;
	}

	private static int multiply(Function<Integer, Integer> func) {
		return func.apply(3);
	}

}
