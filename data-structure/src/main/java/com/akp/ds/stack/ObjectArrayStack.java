package com.akp.ds.stack;

import java.util.Arrays;

public class ObjectArrayStack {

	public static void main(String[] args) {
		ObjectStack<Integer> stack = new ObjectStack<Integer>(10);
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

class ObjectStack<E> {
	E[] stackArr;
	int stackSize;
	int top;

	ObjectStack(int size) {
		this.stackArr = (E[]) new Object[size];
		this.stackSize = size;
		this.top = -1;
	}

	public boolean isEmpty() {
		return (this.top == -1);
	}

	public boolean isFull() {
		return ((this.stackSize - 1) == this.top);
	}

	public boolean push(E val) {
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
			this.stackArr[this.top] = null;
			this.top--;
			return true;
		} else {
			System.out.println("Stack is empty!");
			return false;
		}
	}

	public E peek() {
		if (!isEmpty()) {
			return this.stackArr[this.top];
		} else {
			System.out.println("Stack is empty!");
			return null;
		}
	}

	public String toString() {
		return Arrays.toString(this.stackArr);
	}
}
