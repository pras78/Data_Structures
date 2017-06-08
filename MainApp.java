package com.practice.cracking.coding.sumlinkedlist;

public class MainApp {
	public static void main(String[] args) {

		Node newNode = new Node(7);
		newNode.appendToTail(1);
		newNode.appendToTail(6);

		System.out.println("First list of items");
		newNode.displayNodes();

		Node newNode2 = new Node(2);
		newNode2.appendToTail(8);
		newNode2.appendToTail(3);

		System.out.println("Second list of items");
		newNode2.displayNodes();

		int l = newNode.stackingElements(newNode);
		int j = newNode2.stackingElements(newNode2);

		System.out.println("The final ll is:");
		newNode2.summingElements(l, j).displayNodes();
	}
}
