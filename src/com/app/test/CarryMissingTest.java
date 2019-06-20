package com.app.test;

public class CarryMissingTest {

	public static void main(String[] args) {
		int n1 = 39;
		int n2 = 92;
		int multiplier = 1;
		int ans = 0;
		while (true) {
			int temp = ((n1 % 10) + (n2 % 10)) % 10;
			n1 /= 10;
			n2 /= 10;
			ans += (temp * multiplier);
			multiplier *= 10;
			if (n1 == 0 && n2 == 0)
				break;
		}
		System.out.println(ans);
	}
}
