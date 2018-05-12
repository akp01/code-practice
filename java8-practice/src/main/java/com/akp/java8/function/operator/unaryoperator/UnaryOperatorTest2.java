package com.akp.java8.function.operator.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest2 {
	public static void main(String[] args) {

		UnaryOperator<Integer> operator1 = t -> t + 10;
		UnaryOperator<Integer> operator2 = t -> t * 10;

		// Using andThen()
		int a = operator1.andThen(operator2).apply(5);
		System.out.println(a);

		// Using compose()
		int b = operator1.compose(operator2).apply(5);
		System.out.println(b);
	}
}
