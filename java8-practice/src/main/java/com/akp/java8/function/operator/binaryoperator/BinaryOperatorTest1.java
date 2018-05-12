package com.akp.java8.function.operator.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest1 {
	public static void main(String[] args) {
		BinaryOperator<Integer> operator1 = (a, b) -> a + b;
		System.out.println(operator1.apply(5, 7));

		BinaryOperator<String> operator2 = (s1, s2) -> s1 + s2;
		System.out.println(operator2.apply("Hello ", "BORAJI.COM"));
	}
}
