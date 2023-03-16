package com.java.basic.exercise;

public class Exercise7 {
	int sum1, sum2 = 0, tot = 0, val = 0;

	int value(char c) {
		if (c == 'I') {
			val = 1;
		}
		if (c == 'V') {
			val = 5;
		}
		if (c == 'X') {
			val = 10;
		}
		if (c == 'L') {
			val = 50;
		}
		if (c == 'C') {
			val = 100;
		}
		if (c == 'D') {
			val = 500;
		}
		if (c == 'M') {
			val = 1000;
		}
		return val;
	}

	int romanToInt(String s) {
		for (int i = 0; i < s.length(); i++) {
			sum1 = value(s.charAt(i));
			if (i + 1 < s.length()) {
				int sum2 = value(s.charAt(i + 1));
				if (sum1 >= sum2) {
					tot = tot + sum1;
				} else {
					tot = tot - sum1;
				}
			} else {
				tot = tot + sum1;
			}
		}
		System.out.println(tot);
		return tot;
	}

	public static void main(String[] args) {
		Exercise7 ex = new Exercise7();
		ex.romanToInt("MCMXCIV");
	}
}


