package com.app.seatmaps;

public class BusMap {

	public static void main(String[] args) {
		// int stations[] = { 0, 1, 2, 3, 4, 5 };

		// 0 1 2 3 4 5
		String name[] = { "chennai", "trichy", "madurai", "kovilpatti", "tirunelveli", "kanyakumari" };

		int[] req = new int[2];
		req[0] = 0;// request from
		req[1] = 2;// request to

		int[] block = new int[2];
		block[0] = 2;// blocked from
		block[1] = 4;// blocked to

		System.out.println("================= BOOKED ROUTE =================");
		System.out.println(name[block[0]] + "---" + name[block[1]]);

		System.out.println("================= REQUESTED ROUTE =================");
		System.out.println(name[req[0]] + "---" + name[req[1]]);

		if ((req[0] <= block[0] && req[1] <= block[0]) || (req[0] >= block[1] && req[1] >= block[1])) {
			System.out.println("Available");
		} else { 
			System.out.println("Not - " + "Available");
		}
	}
}