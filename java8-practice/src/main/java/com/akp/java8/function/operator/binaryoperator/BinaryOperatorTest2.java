package com.akp.java8.function.operator.binaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorTest2 {
	public static void main(String[] args) {
		BinaryOperator<Integer> operator = (a, b) -> a + b;
		Function<Integer, Integer> function = n -> n * 2;

		// Using andThen()
		System.out.println(operator.andThen(function).apply(1, 6));

	}
}
