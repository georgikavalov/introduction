package com.musala.edu.introduction.two;

import java.util.Arrays;

public class TaskTwo {

	/**
	 * Constructor
	 */
	private TaskTwo() {
		throw new IllegalStateException("TaskTwo is a static class");
	}

	/**
	 * Gets the sub array that has the largest sum of elements using brute force
	 * method
	 * 
	 * @param array
	 *            original array of integer values
	 * @return int[]
	 */
	public static int[] getLargestSumSubArrayUsingBruteForce(int[] array) {
		int highSum = 0;
		int nextSum = 0;
		int from = 0;
		int to = 0;
		for (int i = 0; i < array.length; i++) {
			nextSum = 0;
			for (int j = i; j < array.length; j++) {
				nextSum += array[j];
				if (nextSum > highSum) {
					highSum = nextSum;
					from = i;
					to = j + 1;
				}
			}
		}
		return Arrays.copyOfRange(array, from, to);
	}

	/**
	 * Gets the sub array that has the largest sum of elements using Khadane's
	 * algorithm method
	 * 
	 * @param array
	 *            original array of integer values
	 * @return int[]
	 */
	public static int[] getLargestSumSubArrayUsingKhadaneAlgorithm(int[] array) {
		int from = 0;
		int to = 0;
		return Arrays.copyOfRange(array, from, to);
	}
}
