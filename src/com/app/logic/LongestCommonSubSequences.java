package com.app.logic;

public class LongestCommonSubSequences {

	static String lcs(String s1, String s2) {
		int n1 = s1.length();
		int n2 = s2.length();
		int count = 0;

		String temp = "";
		String ans = "";

		for (int i = 0; i < n1; i++) {
			count = 0;
			temp = "";
			loop2: for (int j = i; j < n1; j++) {
				if (count == n2) {
					break loop2;
				}
				while (count < n2) {
					if (s1.charAt(j) == s2.charAt(count)) {
						temp += String.valueOf(s1.charAt(j));
						++count;
						break;
					}
					++count;
				}
			}
			if (temp.length() > ans.length()) {
				ans = temp;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		String s1 = "AYGGTAB";
		String s2 = "TXGXAYB1ZSQ"; 
		System.out.println(lcs(s1, s2));
	}

}
