package com.app;

import java.util.Scanner;

public class SmallestGreaterElement {

	void print(int n, int ar[]) {
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + ", ");
		}
	}

	String logic(int val, int temp[]) {
		for (int i = 0; i < temp.length; i++) {
			if(val<temp[i]) {
				return String.valueOf(temp[i]);
			}
		}
		return "-";
	}

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the n - values ");

		int n = scan.nextInt();
		int ar[] = new int[n];
		int temp[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter value ");
			ar[i] = scan.nextInt();
		}

		System.out.println("Given Array ");
		print(n, ar);

		temp = ar.clone();

		// 13, 6, 7, 12
		// 6 3 9 8 10 2 1 15 7
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (temp[j] > temp[j + 1]) {
					int val = temp[j + 1];
					temp[j + 1] = temp[j];
					temp[j] = val;
				}
			}
		}

		System.out.println("Sorted Array ");
		print(n, temp);

		System.out.println("====== Result ========");
		for (int i = 0; i < n; i++) {
			System.out.print(logic(ar[i], temp)+", ");
		}
		scan.close();
	}

	public static void main(String[] args) {
		SmallestGreaterElement element = new SmallestGreaterElement();
		element.input();
	}

}
