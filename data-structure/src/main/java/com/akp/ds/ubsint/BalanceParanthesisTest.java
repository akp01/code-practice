package com.akp.ds.ubsint;

import java.util.Stack;

public class BalanceParanthesisTest {

	public static void main(String args[]) {
		BalanceParanthesisTest o = new BalanceParanthesisTest();
		
		boolean result = o.isBalanced("[qui{ck fox}] [jumped] [{the}] [brown] fox");
		
		System.out.println(result);
	}

	public boolean isBalanced(String inputStr) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < inputStr.length(); i++) {
			if ((inputStr.charAt(i) == '[') || (inputStr.charAt(i) == '{')) {
				stack.push(inputStr.charAt(i));
			} else if ((inputStr.charAt(i) == ']') || (inputStr.charAt(i) == '}')) {
				if (stack.isEmpty()) {
					return false;
				}
				char popItem = (char) stack.pop();
				if (popItem != inputStr.charAt(i)) {
					return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

}
