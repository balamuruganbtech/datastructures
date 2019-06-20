package com.app.test;

public class BusMapTest {

	public static void main(String[] args) {
		String ar[] = { "chennai", "trichy", "madurai", "tirunelveli", "kanyakumari" };
		int[] blocked = { 2, 4 };
		int[] req = { 0, 3 };
		if (req[0] <= blocked[0] && req[1] <= blocked[0] || blocked[1] <= req[0] && blocked[1] <= req[1]) {
			System.out.println("Available");
		}
	}
}
