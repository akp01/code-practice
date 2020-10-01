package com.akp.ds.ubsint;

import java.util.HashMap;

public class StringPermutation {

	public static void main(String[] args) {

		String searchString = "Jav8a";
		String inputString = "Java8";

		System.out.println("Is the mathc found : " + checkIfStringPermutationMatchFound(searchString, inputString));

	}

	public static boolean checkIfStringPermutationMatchFound(String searchString, String inputString) {
		if (searchString.length() > inputString.length()) {
			return false;
		}

		HashMap<Character, Integer> searchStringMap = new HashMap<>();

		for (int i = 0; i < searchString.length(); i++) {
			searchStringMap.put(searchString.charAt(i), searchStringMap.getOrDefault(searchString.charAt(i), 0) + 1);
		}

		for (int i = 0; i <= inputString.length() - searchString.length(); i++) {

			HashMap<Character, Integer> inputStringMap = new HashMap<>();
			for (int j = 0; j < searchString.length(); j++) {
				inputStringMap.put(inputString.charAt(i + j), inputStringMap.getOrDefault(inputString.charAt(i + j), 0) + 1);
			}

			if (matchFound(searchStringMap, inputStringMap)) {
				return true;
			}
		}
		return false;
	}

	public static boolean matchFound(HashMap<Character, Integer> searchStringMap,
			HashMap<Character, Integer> inputStringMap) {
		for (char key : searchStringMap.keySet()) {
			if (searchStringMap.get(key) - inputStringMap.getOrDefault(key, -1) != 0)
				return false;
		}
		return true;
	}
}
