package com.akp.ds.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	
	Node<String> head = null;
	Node<String> tail = null;
	int size = 0;
	
	
	public static void main(String[] args) {
		LinkedList<String> linkedList1 = new LinkedList<>();
		linkedList1.add("abc");
	}
	
	
	
	public void add(String value){
		
	}

	private class Node<T> {
		private T value;
		private Node<T> nextNode;

		public Node(T value, Node nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}
	}

}
