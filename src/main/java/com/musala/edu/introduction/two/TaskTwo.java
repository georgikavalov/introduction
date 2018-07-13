package com.musala.edu.introduction.two;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@code TaskTwo} is a static class
 * 
 * @author georgi.kavalov
 *
 */
public class TaskTwo {

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskTwo.class);

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
		long start = System.currentTimeMillis();
		int from = 0;
		int to = 0;
		long highSum = 0;
		long nextSum = 0;
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
		long end = System.currentTimeMillis();
		return makeResult(array, end - start, from, to, highSum);
	}

	/**
	 * Gets the sub array that has the largest sum of elements using Khadane's
	 * algorithm method
	 * 
	 * @param array
	 *            original array of integer values
	 * @return A subset of the passed array
	 */
	public static int[] getLargestSumSubArrayUsingKhadaneAlgorithm(int[] array) {
		long start = System.currentTimeMillis();
		int from = 0;
		int to = 1;
		long highSum = 0;
		long nextSum = 0;
		for (int i = 0; i < array.length; i++) {
			nextSum = nextSum + array[i];
			if (nextSum < 0) {
				nextSum = 0;
				from = i + 1;
			}
			if (highSum < nextSum) {
				highSum = nextSum;
				to = i + 1;
			}
		}
		long end = System.currentTimeMillis();
		return makeResult(array, end - start, from, to, highSum);
	}

	/**
	 * Presents information to console and returns a subarray using the passed
	 * parameters.
	 * 
	 * @param array
	 *            Original array
	 * @param timeTaken
	 *            total time taken to calculate the result
	 * @param from
	 *            starting index of the subarray result
	 * @param to
	 *            end index of the subarray result
	 * @param highSum
	 *            the sum of the subarray elements
	 * @return int[]
	 */
	private static int[] makeResult(int[] array, long timeTaken, int from, int to, long highSum) {
		int[] retVal = Arrays.copyOfRange(array, from, to);
		final String STRINGIFIED_RETVAL = Arrays.toString(retVal);
		LOGGER.info("The subarray from index {} to {} inclusively, {}, has the largest sum of {}. Found in {}ms", from,
				to - 1, STRINGIFIED_RETVAL, highSum, timeTaken);
		return retVal;
	}
}
