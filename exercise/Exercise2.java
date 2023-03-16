package com.java.basic.exercise;

public class Exercise2 {
	static void Arrange(String[] arr, int n) {
		int j;
		String key;
		for (int i = 1; i < n; i++) {
			key = arr[i];

			if (Integer.parseInt(key) < 0) {
				continue;
			}

			j = i - 1;
			while (j >= 0 && Integer.parseInt(arr[j]) < 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		String arr[] = { "20", "10", "80", "-2", "0", "-4", "1" };
		int n = arr.length;
		Arrange(arr, n);
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}
}
