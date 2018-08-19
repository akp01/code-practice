package com.akp.prgm.array;

import java.util.Arrays;

public class MissingNumberInIntegerArray {

	public static void main(String[] args) {
		int n = 8;
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };

		int sumOfNnumbers = sumOfNnumbers(n);
		int sumOfElements = Arrays.stream(a).sum();

		System.out.println("Missing Number is = " + (sumOfNnumbers - sumOfElements));
	}

	static int sumOfNnumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}
}
