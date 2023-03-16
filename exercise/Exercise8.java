package com.java.basic.exercise;

import java.util.Arrays;

public class Exercise8 {
	public static String longestCommonPrefix(String[] strs) {
		int i, j;
		int n = strs.length;
		String s = "";
		int min = 201;
		for (int k = 0; k < n; k++) {
			if (min > strs[k].length()) {
				min = strs[k].length();
			}
		}
		if (n == 1) {
			s = strs[0];
		} else {
			for (i = 1; i < n; i++) {
				if (strs[i].length() > 0 && strs[0].length() > 0) {
					for (j = 0; j < min; j++) {
						if (strs[0].charAt(j) == strs[i].charAt(j)) {
							if (i == n - 1) {
								s = s + strs[0].charAt(j);
							}
						} else {
							break;
						}
					}
					if (strs[0].charAt(0) != strs[1].charAt(0)) {
						break;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(s);
		return s;
	}

	public static void main(String[] args) {
		// String[] strs = { "flower", "flow", "flight" };
		String[] strs = {"zzba", "zz", "zsfz", "zzx", "zz"};
		Arrays.sort(strs);
		longestCommonPrefix(strs);
	}
}
