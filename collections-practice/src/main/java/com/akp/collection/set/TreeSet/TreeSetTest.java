package com.akp.collection.set.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.akp.cp.common.Car;
import com.akp.cp.common.CustomComparator;

public class TreeSetTest {
	public static void main(final String[] args) {
		final TreeSet<Car> treeSet = new TreeSet<Car>();
		
		for(int i = 0; i<100; i++){
			final Car c = new Car("H-"+i);
			c.setPrice((int)(Math.random()*100)+1);
			treeSet.add(c);
		}
		
		final Car c3 = new Car("H-499");
		c3.setPrice(50);
		treeSet.add(c3);
		final Iterator<Car> carIterator = treeSet.iterator();
		while(carIterator.hasNext()){
			final Car c = carIterator.next();
			System.out.println(c+" - Price - "+c.getPrice());
		}

		System.out.println("First:-"+treeSet.first());
		System.out.println("Last:-"+treeSet.last());


		final Iterator<Car> headSetIterator = treeSet.headSet(c3).iterator();
		while (headSetIterator.hasNext()){
			final Car c2 = headSetIterator.next();
			System.out.println(c2+" Price :- "+c2.getPrice());
		}
		System.out.println("--------");
		final Iterator<Car> tailSetIterator = treeSet.tailSet(c3).iterator();
		while(tailSetIterator.hasNext()){
			final Car x = tailSetIterator.next();
			System.out.println(x+" Price :- "+x.getPrice());
		}
	
		System.out.println("Navigable Set methods");
		System.out.println(treeSet.ceiling(c3));
		System.out.println(treeSet.floor(c3));
		
		System.out.println(treeSet.higher(c3));
		System.out.println(treeSet.lower(c3));
		
		System.out.println("Custom Comparator");
		final TreeSet<Car> cars = new TreeSet<Car>(new CustomComparator());
		cars.addAll(treeSet);
		final Iterator<Car> carsIterator2 = cars.iterator();
		while(carsIterator2.hasNext()){
			final Car c = carsIterator2.next();
			System.out.println(c+" Price :- "+c.getPrice());
		}
		}
}
