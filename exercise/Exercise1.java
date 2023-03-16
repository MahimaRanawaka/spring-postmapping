package com.java.basic.exercise;

public class Exercise1 {
	public static void main(String[] args) {
		int array[] = { 1, 5, 6, 8, 2, 3, 7, 9, 4, 10 };
		int sum = 0;
		int i;

		for (i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Sum: " + sum);
		int average = (sum / 10);
		System.out.println("Average: " + average);
	}
}
