package com.app;

public class EnglishWords {

	static String units[] = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelfth", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	static String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	static String convert(int n) {
		if (n < 0) {
			return "Minus " + convert(-n);
		}
		if (n < 20) {
			return units[n];
		}
		if (n < 100) {
			return tens[n / 10] + " " + units[n % 10];
		}
		if (n < 1000) {
			return units[n / 100] + " Hundred" + " " + convert(n % 100);
		}
		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + " " + convert(n % 1000);
		}
		if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + " " + convert(n % 10000);
		}
		return convert(n / 10000000) + " Crore" + convert(n % 10000000);
	}

	public static void main(String[] args) {
		System.out.println(convert(-19));
		System.out.println(convert(19));
		System.out.println(convert(35));
		System.out.println(convert(784));
		System.out.println(convert(8530));
		System.out.println(convert(88530));
		System.out.println(convert(888530));
		System.out.println(convert(8888530));
		System.out.println(convert(99925555));
		System.out.println(convert(123));
	}

}
