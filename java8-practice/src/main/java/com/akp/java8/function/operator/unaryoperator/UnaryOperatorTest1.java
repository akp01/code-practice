package com.akp.java8.function.operator.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest1 {
	public static void main(String[] args) {

		UnaryOperator<Integer> operator = x -> x * 2;

		System.out.println(operator.apply(5));
		System.out.println(operator.apply(10));
		System.out.println(operator.apply(15));
	}
}
