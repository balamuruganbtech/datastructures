package com.app.seatmaps;

public class TrainMap {
	public static void main(String[] args) {
		String stations[] = { "chennai", "trichy", "madurai", "kovilpatti", "tirunelveli", "kanyakumari" };

		// search seat availability
		int[] req = { 0, 2 }; //(1,5),(0,2)

		// already seat blocked
		int[] block = { 2, 5 };//(1,5),(0,2)

		System.out.println(" Requested Route ");
		System.out.println("================");
		System.out.println(stations[req[0]] + " " + stations[req[1]]+"\n");

		System.out.println(" Blocked Route ");
		System.out.println("================");
		System.out.println(stations[block[0]] + " " + stations[block[1]]+"\n");

		if ( (req[0] <= block[0] && req[1] <= block[0]) || (req[0] >= block[1] && req[1] >= block[1])) {
			System.out.println("Available");
		}else {
			System.out.println("Not-Available");
		}
	}
}
