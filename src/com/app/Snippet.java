package com.app;

import java.util.LinkedList;
import java.util.Queue;

public class Snippet {
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i=1;i<6;i++)
			q.add(i);
		
		System.out.println(q);
		
		int j = q.remove();
		System.out.println("removedElement="+j);
		
		System.out.println(q);
		
		// to view head of the queue
		int peek = q.peek();
		System.out.println("head of the queue "+peek);
		
		// to view head of the queue
		int poll = q.poll();
		System.out.println("after poll of the queue "+poll);
		
		System.out.println("after poll of the queue "+q);
		
	}
}

