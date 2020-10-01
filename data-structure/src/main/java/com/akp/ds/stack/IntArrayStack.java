package com.akp.ds.stack;

import java.util.Arrays;

public class IntArrayStack {

	public static void main(String[] args) {
		IntStack stack = new IntStack(10);
		System.out.println("Stack before push : " + stack.toString());

		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println("Stack after push : " + stack.toString());

		stack.pop();
		System.out.println("Stack after pop : " + stack.toString());

		stack.peek();
		System.out.println("Stack after peek : " + stack.toString());

	}

}

class IntStack {
	int[] stackArr;
	int stackSize;
	int top;

	IntStack(int size) {
		stackArr = new int[size];
		this.stackSize = size;
		this.top = -1;
	}

	public boolean isEmpty() {
		return (this.top == -1);
	}

	public boolean isFull() {
		return ((this.stackSize - 1) == this.top);
	}

	public boolean push(int val) {
		if (!isFull()) {
			this.top++;
			this.stackArr[this.top] = val;
			System.out.println("Pushed element:" + val);
			return true;
		} else {
			System.out.println("Stack is full !");
			return true;
		}
	}

	public boolean pop() {
		if (!isEmpty()) {
			this.stackArr[this.top] = 0;
			this.top--;
			return true;
		} else {
			System.out.println("Stack is empty!");
			return false;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return this.stackArr[this.top];
		} else {
			System.out.println("Stack is empty!");
			return -1;
		}
	}

	public String toString() {
		return Arrays.toString(this.stackArr);
	}
}
