package com.app;

public class EnglishWords2 {

	static String units[] = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelfth", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	static String convert(int n) {
		if (n < 20) {
			return units[n];
		}
		if(n<100) {
			return tens[n/10] +" "+ units[n%10];
		}
		if(n<1000) {
			return units[n/100]+" hundred "+convert(n%100);
		}
		if(n<100000) {
			return convert(n/1000)+" thousand "+convert(n%1000);
		}
		if(n<10000000) {
			return convert(n/100000)+" lakh "+convert(n%100000);
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(convert(19));
		System.out.println(convert(78));
		System.out.println(convert(999));
		System.out.println(convert(2000));
		System.out.println(convert(75584));
		System.out.println(convert(175584));
		System.out.println(convert(1175584));
	}

}
