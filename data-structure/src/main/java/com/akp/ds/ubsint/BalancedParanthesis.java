package com.akp.ds.ubsint;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

		String inputStr = "";
		inputStr = "[quick fox] [jumped] [the] [brown] fox";
		inputStr = "[quick fox] [jumped]] [the] [brown] fox";
		inputStr = "[quick fox] [jumped][ [the] [brown] fox";
		System.out.println(" Is paranthesis balanced : " + isParenthesisBalanced(inputStr));

	}

	public static boolean isParenthesisBalanced(String inputStr) {
		if (null == inputStr || inputStr.isBlank()) {
			return true;
		}

		char[] charArr = inputStr.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < inputStr.length(); i++) {

			if (charArr[i] == '[') {
				stack.push('[');
			} else if (charArr[i] == ']' && !stack.isEmpty()) {
				stack.pop();
			} else if (charArr[i] == ']' && stack.isEmpty()) {
				return false;
			}
		}

		if (stack.isEmpty()) {
			return true;
		}

		return false;
	}

}
