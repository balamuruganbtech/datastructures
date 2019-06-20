package com.app.test;

public class LCSTest {

	static String lcs(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int count = 0;

		String ans = "";
		String temp = "";

		loop1: for (int i = 0; i < n1; i++) {
			count = 0;
			temp = "";
			loop2: for (int j = i; j < n1; j++) {
				if (n2 == count)
					break loop2;
				while (count < n2) {
					if (s1.charAt(j) == s2.charAt(count)) {
						temp += String.valueOf(s1.charAt(j));
						++count;
						break;
					}
					++count;
				}
			}
//			System.out.println("LCS temp-->" + temp);
			if (ans.length() < temp.length()) {
				ans = temp;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s1 = "BALAMURUGAN";//AYGGTAB
		String s2 = "LOGICSBALAXYZM";//TXGXAYB1ZSQ
		System.out.println("LCS-->" + lcs(s1, s2));
	}

}
