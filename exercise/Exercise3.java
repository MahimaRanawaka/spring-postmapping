package com.java.basic.exercise;

public class Exercise3 {
	static void Arrange(String[] inputArray, int inputInt) {
		for (int i = 1; i < inputInt; i++) {
			if (Integer.parseInt(inputArray[i]) < 0) {
				String temp = inputArray[i];
				for (int j = i + 1; j < inputInt; j++) {
					inputArray[j - 1] = inputArray[j];
				}
				inputArray[inputInt - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		String inputArray[] = { "20", "10", "80", "-2", "0", "-4", "1" };
		int inputInt = inputArray.length;
		Arrange(inputArray, inputInt);
		for (int k = 0; k < inputInt; k++) {
			System.out.print(inputArray[k]+" ");
		}
	}
}
