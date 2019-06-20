package com.app.logic;

public class CarryMissing {

	public static void main(String[] args) {
		

		String s = "baalamurugan";//scthishsaa
		//, saathishsaaaaa
		
		String r="";

		boolean flag = false;
		int n =0;
		for (int i = 0; i < s.length(); i++) {
			if (!flag) {
				r+=s.charAt(i);
			} else {
				if (s.charAt(i) == 'a')
					r=r.substring(0,i-n-1) +"c";
				n++;
				flag = false;
				continue;
			}

			if (s.charAt(i) == 'a') {
				flag = true;
			}

		}
		System.out.println(r);
		
		int n1 = 89;
		int n2 = 42;
		int res = 0;
		int multiplier = 1;
		while (true) {
			int sum = (n1 % 10) + (n2 % 10);
			sum %= 10;

			res = (sum * multiplier) + res;

			n1 /= 10;
			n2 /= 10;

			// update multiplier
			multiplier *= 10;

			if (n1 == 0 && n2 == 0)
				break;

		}
		System.out.println("sum= " + res);

	}

}
