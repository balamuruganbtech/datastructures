package com.app;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionValid {
	
	static boolean isSafe(char ch, Deque<Character> q) {
		if(q.peek()!=null && ((ch=='}' && q.peekLast()=='{') || (ch==']' && q.peekLast()=='[') || (ch==')' && q.peekLast()=='('))) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
			String s="({[]})";
			Deque<Character> q = new LinkedList<>();
			int counter=0;
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch=='(' || ch=='{' || ch=='[') {
					q.offer(ch);
					++counter;
				}
				if(ch==')' || ch=='}' || ch==']') {
					--counter;
				}
				if(q.peek()!=null && isSafe(ch, q)){
					q.pollLast();
				}
				if(counter<0) {
					break;
				}
			}
			if(q.peek()==null && counter==0)
				System.out.println("balanced");
			else
				System.out.println("un-balanced");
				
	}

}
