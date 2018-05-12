package com.akp.java8.function.operator.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest3 {
	public static void main(String[] args) {

		Comparator<Integer> comparator = (a, b) -> (a.compareTo(b));

		// Using maxBy()
		BinaryOperator<Integer> opMax = BinaryOperator.maxBy(comparator);
		System.out.println("Max: " + opMax.apply(5, 6));
		System.out.println("Max: " + opMax.apply(9, 6));

		// Using minBy()
		BinaryOperator<Integer> opMin = BinaryOperator.minBy(comparator);
		System.out.println("Min: " + opMin.apply(5, 6));
		System.out.println("Min: " + opMin.apply(9, 6));
	}
}