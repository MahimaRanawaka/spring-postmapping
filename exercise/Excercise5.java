package com.java.basic.exercise;

public class Excercise5 {

	static void visitorsCount(String input) {
		int len = input.length();
		char letter;
		int i;
		int count1 = 0, count2 = 0, count3 = 0;

		for (i = 0; i < len; i++) {
			letter = input.charAt(i);
			if (letter == 'W') {
				count1 = count1 + 1;
			} else if (letter == 'M') {
				count2 = count2 + 1;
			} else if (letter == 'C') {
				count3 = count3 + 1;
			} else {
				break;
			}
		}

		if ((count1 > count2) && (count2 > count3) && (count1 > count3)) {
			if ((count1 != 0) && (count2 != 0) && (count3 != 0)) {
				System.out.println(count1 + "W" + count2 + "M" + count3 + "C");
			} else if (count3 == 0) {
				System.out.println(count1 + "W" + count2 + "M");
			}
		} else if ((count2 > count1) && (count2 > count3) && (count1 > count3)) {
			if ((count1 != 0) && (count2 != 0) && (count3 != 0)) {
				System.out.println(count2 + "M" + count1 + "W" + count3 + "C");
			} else if (count3 == 0) {
				System.out.println(count2 + "M" + count1 + "W");
			}
		} else if ((count3 > count1) && (count3 > count2) && (count1 > count2)) {
			if ((count1 != 0) && (count2 != 0) && (count3 != 0)) {
				System.out.println(count3 + "C" + count1 + "W" + count2 + "M");
			}
		} else if ((count1 == count2) || (count1 == count3) || (count2 == count3)) {
			System.out.println(count2 + "M" + count1 + "W" + count3 + "C");
		} else if ((count3 > count1) && (count1 == count2)) {
			if ((count1 != 0) && (count2 != 0)) {
				System.out.println(count2 + "M" + count1 + "W" + count3 + "C");
			}
		} else if ((count1 > count2) && (count2 == count3)) {
			if ((count2 != 0) && (count3 != 0)) {
				System.out.println(count2 + "M" + count1 + "W" + count3 + "C");
			}
		} else if ((count2 > count1) && (count1 == count3)) {
			if ((count1 != 0) && (count3 != 0)) {
				System.out.println(count2 + "M" + count1 + "W" + count3 + "C");
			}
		} else if (count3 == 0) {
			if ((count1 != 0) && (count2 != 0)) {
				if (count1 > count2) {
					System.out.println(count1 + "W" + count2 + "M");
				} else {
					System.out.println(count2 + "M" + count1 + "W");
				}
			}
		} else if (count1 == 0) {
			if ((count2 != 0) && (count3 != 0)) {
				if (count2 > count3) {
					System.out.println(count2 + "M" + count3 + "C");
				} else {
					System.out.println(count3 + "C" + count2 + "M");
				}
			}
		} else if (count2 == 0) {
			if ((count1 != 0) && (count3 != 0)) {
				if (count1 > count3) {
					System.out.println(count1 + "W" + count3 + "C");
				} else {
					System.out.println(count3 + "C" + count1 + "W");
				}
			}
		}
	}

	public static void main(String[] args) {
		String input = "MMW";
		visitorsCount(input);
	}
}
