package com.java.basic.exercise;

public class Exercise4 {

	static void Number(int[] arr, int len) {
		int i, j;
		int count = 0;
		for (i = 0; i < len - 1; i++) {
			if ((arr[i] == arr[i + 1]) && (arr[i] == arr[i + 2])) {
				System.out.println("Yes1");
			} else {
				for (j = i + 1; j < len; j++) {
					if (arr[i] == arr[i + 1]) {
						count = count + 1;
					}
				}
			}
		}
		if (count >= 4) {
			System.out.println(count);
			System.out.println("Yes2");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 7, 7, 7, 8, 4, 8, 9, 8 };
		int len = arr.length;
		Number(arr, len);
	}
}
