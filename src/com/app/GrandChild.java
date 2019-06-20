package com.app;

public class GrandChild {
	
	void traverse(Node node, int parent) { 
		
		if(node==null)
			return;
		
		if(node.data==parent)
			displayChilds(node,0);
		
		traverse(node.left,parent);
		traverse(node.right,parent);
	}
	
	void displayChilds(Node node, int height) {
		
		if(node==null || height==3)
			return;
		
		if(height==1 || height==2)
			System.out.println(node.data);
		
		displayChilds(node.left, height+1);
		displayChilds(node.right, height+1);
	}

	public static void main(String[] args) {
		
		GrandChild gc = new GrandChild();

		Node node = new Node(2);

		node.left = new Node(9);
		node.right = new Node(3);
		
		node.left.left = new Node(8);
		node.left.right = new Node(4);
		
		node.left.left.left = new Node(5);
		node.left.left.right = new Node(2);
		
		node.left.right.left = new Node(1);
		node.left.right.right = new Node(7);

		node.right.left = new Node(8);
		node.right.right = new Node(10);
		
		node.right.left.right = new Node(6);
		
		node.right.right.left = new Node(8);
		node.right.right.right = new Node(11);
		
//		gc.traverse(node, 3);
//		gc.traverse(node, 4);
//		gc.traverse(node, 9);
		gc.traverse(node, 4);
		
	}

}
