package com.akp.ds.linkedlist;

public class DeleteLinkedListNodeAtAGivenPosition {
	Node head;

	class Node {
		private String data;
		private Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;

		}
	}

	private void addElement(Node newNode) {
		newNode.next = head;
		head = newNode;
	}

	private void displayLinkedlIst() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;

		}
	}

	private void deleteNodeAtAGivenPosition(int position) {

		Node current = head;
		Node prev = null;

		while (current != null) {

		}

	}

	public static void main(String[] args) {

	}

}
