package com.app;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionValidTest {

	static boolean isOpen(char ch) {
		if (ch == '{' || ch == '(' || ch == '[') {
			return true;
		}
		return false;
	}
	static boolean isClose(char ch) {
		if (ch == '}' || ch == ')' || ch == ']') {
			return true;
		}
		return false;
	}
	
	static boolean pairMatch(char ch1, char ch2) {
		if ((ch1=='{' && ch2 == '}') || (ch1=='[' && ch2 == ']') || (ch1=='(' && ch2 == ')')) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String pattern = "{([])}";
		int n = pattern.length();
		int counter=0;
		Deque<Character> q = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			char ch = pattern.charAt(i);
			if (isOpen(ch)) {
				q.offer(ch);
				++counter;
			}
			if(isClose(ch)) {
				Character temp=q.peekLast();
				if(pairMatch(temp, ch)) {
					q.pollLast();
				}else {
					System.out.println("KO");
					break;
				}
				--counter;
			}
		}
		if(counter==0 && q.peek()==null) {
			System.out.println("wow");
		}
	}

}
