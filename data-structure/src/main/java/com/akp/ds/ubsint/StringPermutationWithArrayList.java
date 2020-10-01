package com.akp.ds.ubsint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutationWithArrayList {

	static List<String> finalList = new ArrayList<String>();

	public static void main(String[] args) {
		String input = "Java8";
		findPermutations(input, "");
		System.out.println();

		System.out.println("is Jaav8 present in set=" + finalList.contains("Jaav8"));
		System.out.println("size = " + finalList.size());
	}

	public static void findPermutations(String input, String ans) {

		if (input.length() == 0) {
			System.out.println(ans);
			finalList.add(ans);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String ros = input.substring(0, i) + input.substring(i + 1);
			findPermutations(ros, ans + ch);
		}

	}

}
