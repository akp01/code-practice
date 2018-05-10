package com.akp.ds.stack;

import java.util.Arrays;

public class StackDataStructure {

	private String[] stackStr = new String[5];
	private int top = -1;

	public static void main(String[] args) {

		StackDataStructure ds = new StackDataStructure();
		ds.push("xyz");
		Arrays.asList(ds.stackStr).forEach(System.out::println);

		ds.top();
		ds.isEmpty();

		ds.pop();
		Arrays.asList(ds.stackStr).forEach(System.out::println);

	}

	private void push(String value) {
		top = top + 1;
		stackStr[top] = value;
	}

	private boolean pop() {
		if (top == -1) {
			return false;
		} else {
			stackStr[top] = null;
			top = top - 1;
			return true;
		}
	}

	private String top() {
		return stackStr[top];
	}

	private boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

}
