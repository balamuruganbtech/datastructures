package com.app;

public class MirrorTree {
	
	static boolean isMirror(Node node1, Node node2) {
		
		if(node1==null && node2==null)
			return true;
		
		if(node1==null || node2==null)
			return false;
		
		if(node1.data==node2.data) {
			if(!isMirror(node1.left, node2.right) ||  !isMirror(node1.right, node2.left))
				return false;
		}else {
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {

		Node node1 = new Node(1);
		node1.left = new Node(2);
		node1.left.right = new Node(4);
		node1.right = new Node(3);
		node1.right.left = new Node(5);

		Node node2 = new Node(1);
		node2.left = new Node(3);
		node2.left.right = new Node(5);
		node2.right = new Node(2);
		node2.right.left = new Node(4);
		
		if(isMirror(node1, node2)) {
			System.out.println("S");
		}else {
			System.out.println("No");
		}
	}

}
