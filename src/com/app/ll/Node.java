package com.app.ll;

public class Node<T extends Comparable<T>> {
	
	T data;// custom object
	Node<T> nextNode;// pointer pointing to the next node
	
	public Node(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
