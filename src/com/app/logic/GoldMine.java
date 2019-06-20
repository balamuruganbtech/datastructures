package com.app.logic;

public class GoldMine {

	static int row = 4, col = 4;

	static int maxGold(int ar[][], int m, int n) {
		if(m>=row|| m<0 || n>=col || n<0)
			return 0;
		return ar[m][n]+max(maxGold(ar, m-1, n+1),maxGold(ar, m, n+1),maxGold(ar, m+1, n+1));
		
	}

	static int max(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		if (b >= a && b >= c)
			return b;
		return c;
	}

	public static void main(String[] args) {
		int gold[][] = { { 10, 33, 13, 15 }, { 22, 21, 04, 1 }, { 5, 0, 2, 3 }, { 0, 26, 74, 2 } };

		int max = 0;

		for (int i = 0; i < row; i++) {

			int temp = maxGold(gold, i, 0);

			if (max < temp)
				max = temp;
		}
		System.out.println("Max = " + max);

	}

}
