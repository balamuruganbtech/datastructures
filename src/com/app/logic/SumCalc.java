package com.app.logic;

public class SumCalc {

	public static void main(String[] args) {
		int ar[] = { 6, 5, -7, 3, 2, 4, -2 };
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		int lhs = 0;
		for (int i = 1; i < ar.length; i++) {
			lhs += ar[i - 1];
			int rhs = sum - ar[i] - lhs;
			if (lhs == rhs) {
				System.out.println(i);
			}
		}

	}

}
