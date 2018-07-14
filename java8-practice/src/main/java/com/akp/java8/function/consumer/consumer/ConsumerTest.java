package com.akp.java8.function.consumer.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(final String[] args) {
	
		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("Java2s.com");

		int x = 99;
		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + x); // Statement A
			System.out.println("y = " + y);
		};

		myConsumer.accept(x);

		
		
		
		/*Consumer consumer = ConsumerTest::printNames;
		consumer.accept("Jeremy");
		consumer.accept("Paul");
		consumer.accept("Richard");*/
		
		
	}
	   
	
	private static void printNames(String name) {
	    System.out.println(name);
	}



}


