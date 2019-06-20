package com.app.logic;

public class GfG {

	public static int xSum(int n, int m) {
		int res = 0;
		int multiplier = 1;
		int bit_sum;

		// Add numbers till each
		// number become zero
		while (true) {

			// Add each bits
			bit_sum = (n % 10) + (m % 10);

			// Neglect carry
			bit_sum %= 10;

			// Update result
			res = (bit_sum * multiplier) + res;
			n /= 10;
			m /= 10;

			// Update multiplier
			multiplier *= 10;
			
			if (n == 0 && m == 0)
				break;
		}
		return res;
	}

	// Driver function
	public static void main(String args[]) {
		int n = 12;
		int m = 19;
		System.out.println(xSum(n, m));
	}
}