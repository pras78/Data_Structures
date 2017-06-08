package com.practice.cracking.coding.sumlinkedlist;

public class Node extends LinkedStack {

	Node next = null;
	int data;

	public Node() {

	}

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	void displayNodes() {
		Node n;
		n = this;
		if (n != null) {
			do {
				System.out.println(n.data);
				n = n.next;
			} while (n != null);
		}
	}

	Node deleteNode(int d) {
		Node head = this;
		Node n = head;
		if (n.data == d) {
			return head.next;
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head; // head didn't change
			}
			n = n.next;

		}
		return head;

	}

	// below are the methods for the latest function
	public int stackingElements(Node list) {

		LinkedStack linkedStack = new LinkedStack();

		Node n;
		n = this;
		if (n != null) {
			do {
				System.out.println(n.data);
				linkedStack.push(n.data);
				n = n.next;
			} while (n != null);
		}

		StringBuilder sb = new StringBuilder();
		while (linkedStack.isEmpty() != true) {
			sb.append(linkedStack.pop());
		}
		System.out.println(Integer.parseInt(sb.toString()) + "--");
		int k = Integer.parseInt(sb.toString());

		return k;

	}

	public Node summingElements(int l, int j) {

		int sum = l + j;
		System.out.println(sum);
		String number = String.valueOf(sum);
		char[] array = number.toCharArray();

		Node node3 = new Node(Character.getNumericValue(array[0]));
		for (int o = 1; o < array.length; o++) {
			node3.appendToTail(Character.getNumericValue(array[o]));
		}
		return node3;

	}

}
