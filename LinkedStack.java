package com.practice.cracking.coding.sumlinkedlist;

import java.util.NoSuchElementException;

public class LinkedStack implements Stack {

	private class Node {
		public int data;
		public Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node top = null;

	@Override
	public int size() {
		int count = 0;
		for (Node node = top; node != null; node = node.next) {
			count++;

		}

		return count;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int n = peek();
		top = top.next;
		return n;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub

		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;

	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		top = new Node(item, top);

	}

}
