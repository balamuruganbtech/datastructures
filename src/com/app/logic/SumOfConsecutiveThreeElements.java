package com.app.logic;

public class SumOfConsecutiveThreeElements {

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < ar.length; i++) {
		 * 
		 * if (i < n) { sum += ar[i]; } if (i >= n) { sum = sum - ar[i - n] + ar[i]; }
		 * if (i >= n - 1 && sum == ans) { System.out.println("start= " + (i - (n - 1))
		 * + " end= " + i); } }
		 * 
		 */
		int ar[] = { 3, 4, 4, 2, 4, 5, -3, -2, 7 };
		int ans = 8;
		int n = 4;
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			if (i < n)
				sum += ar[i];

			if (i >= n)
				sum = sum - ar[i - n] + ar[i];

			if (sum == ans)
				System.out.println("wow--> "+i+", "+((i-4)+1));
		}
	}

}
