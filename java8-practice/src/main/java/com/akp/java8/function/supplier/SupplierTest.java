package com.akp.java8.function.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(final String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> {
			printNames(() -> x);
		});
	}

	static void printNames(Supplier arg) {
		System.out.println(arg.get());
	}

}
