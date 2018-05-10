package com.akp.collection.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import com.akp.cp.common.Car;

public class HashSetTest {
	public static void main(final String[] args) {
		final HashSet<Car> carSet = new HashSet<Car>();

		for (int i = 0; i < 100; i++) {
			carSet.add(new Car("H-" + i));
		}

		final Iterator<Car> carIterator = carSet.iterator();
		while (carIterator.hasNext()) {
			System.out.println(carIterator.next());
		}

		System.out.println(carSet.add(new Car("H-0")));
	}
}
