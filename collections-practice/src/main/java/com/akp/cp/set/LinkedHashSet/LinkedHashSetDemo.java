package com.akp.cp.set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(final String[] args) {

		final LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

		// Adding element to LinkedHashSet
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");

		// This will not add new element as A already exists
		linkedHashSet.add("A");
		linkedHashSet.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedHashSet.size());
		System.out.println("Original LinkedHashSet:" + linkedHashSet);
		System.out.println("Removing D from LinkedHashSet: " + linkedHashSet.remove("D"));
		System.out.println("Trying to Remove Z which is not " + "present: " + linkedHashSet.remove("Z"));
		System.out.println("Checking if A is present=" + linkedHashSet.contains("A"));
		System.out.println("Updated LinkedHashSet: " + linkedHashSet);
	}
}
