package com.akp.java8.stream;

import static java.util.stream.Collectors.toList;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {
	public static void main(final String[] args) {
		printNPrimesFrom(10, 1);
		printNPrimesFrom(5, 100);
	}

	public static void printNPrimesFrom(final int count, final int from) {
		System.out.println(count + " primes from " + from);
		System.out.println(Prime.getPrimesFrom(from).limit(count).collect(toList()));
	}

}

class Prime {

	public static Stream<Integer> getPrimesFrom(final int start) {
		return Stream.iterate(getNext(start - 1), Prime::getNext);
	}

	private static int getNext(final int number) {
		if (isPrime(number + 1)) {
			return number + 1;
		} else {
			return getNext(number + 1);
		}
	}

	private static boolean isPrime(final int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}
}
