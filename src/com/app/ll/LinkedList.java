package com.app.ll;

public class LinkedList<T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		++this.sizeOfList;

		if (this.root == null) {
			this.root = new Node(data);
		} else {
			insertAtBegining(data);
		}
	}

	// O(1)
	private void insertAtBegining(T data) {
		Node newNode = new Node(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}

	// O(N)
	private void insertAtEnd(T data, Node<T> node) {
		if (node.getNextNode() != null) {
			insertAtEnd(data, node.getNextNode());
		} else {
			Node newNode = new Node(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if (this.root == null)
			return;
		--this.sizeOfList;
		if (this.root.getData().compareTo(data) == 0) {
			this.root = this.root.getNextNode();
		} else {
			remove(data, this.root, this.root.getNextNode());
		}

	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		while (actualNode != null) {
			if (actualNode.getData().compareTo(data) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverseList() {
		// forward

		
		reverseList();
	}

	public void reverseList() {
		System.out.println("=== reverse order===");
		Node node = root;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}

	@Override
	public String toString() {
		return "LinkedList [root=" + root + ", sizeOfList=" + sizeOfList + "]";
	}

}
