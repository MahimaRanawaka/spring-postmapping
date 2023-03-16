package com.java.basic.exercise;

public class Excercise6 {
	public static int[] twoSum(int[] nums, int target) {
		int i;
		String output = null;
		for (i = 0; i < nums.length - 1; i++) {
			int sum = nums[i] + nums[i + 1];
			if (sum == target) {
				output = "[" + i + "," + (i + 1) + "]";
			}
		}
		System.out.println(output);
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		twoSum(nums, target);
	}
}
