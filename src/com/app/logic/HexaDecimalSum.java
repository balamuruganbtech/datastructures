package com.app.logic;

public class HexaDecimalSum {

	static String convertHexa(int val) {
		int quotient = 0;
		int remainder = 0;
		String remain = "";
		while (val > 0) {
			quotient = val / 16;
			remainder = val % 16;
			if (remainder >= 10) {
				int i = (remainder - 10);
				char res = (char) ('A' + i);
				remain += String.valueOf(res);
			}
			remain += String.valueOf(remainder);
			val = quotient;
		}
		return new StringBuilder(remain).reverse().toString();
	}

	public static void main(String[] args) {
		String s1 = "2AF";
		String s2 = "B3";
		s2 = "0" + s2;
		int carry=0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			int val1 = 0;
			int val2 = 0;

			if (Character.isAlphabetic(ch1)) {
				val1 = ch1 - 'A' + 10;
			} else {
				val1 = Integer.parseInt(String.valueOf(ch1));
			}

			if (Character.isAlphabetic(ch2)) {
				val2 = ch2 - 'A' + 10;
			} else {
				val2 = Integer.parseInt(String.valueOf(ch2));
			}

			
			int sum = val1 + val2+carry;

//			System.out.println(val1 + ", " + val2);
//			int result=convertHexa(sum);
			System.out.println();
		}

	}

}
