package com.akp.collection.set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.akp.cp.common.Car;

public class LinkedHashSetTest {
	public static void main(final String[] args) {
		final LinkedHashSet<Car> linkedHashSet = new LinkedHashSet<Car>();

		for (int i = 0; i < 100; i++) {
			linkedHashSet.add(new Car("H-" + i));
		}

		final Iterator<Car> carIterator = linkedHashSet.iterator();

		while (carIterator.hasNext()) {
			final Car c = carIterator.next();
			carIterator.remove();
		}
		System.out.println(linkedHashSet.add(new Car("H-0")));
		System.out.println(linkedHashSet.size());
	}
}
