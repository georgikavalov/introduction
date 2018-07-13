package com.musala.edu.introduction.two;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * The {@code TestTaskTwo} class contains unit tests for task two of part one
 * 
 * @author georgi.kavalov
 *
 */
public class TestTaskTwo {

	/**
	 * Tests getting of largest contiguous sub array from an unordered array using
	 * brute force approach.
	 */
	@Test
	public void testLargestSumSubArrayFromUnorderedArrayUsingBruteForce() {
		int[] array = new int[] { 456, -231, -234, 46, 38, 388, -1, 0, -4 };
		assertArrayEquals(new int[] { 46, 38, 388 }, TaskTwo.getLargestSumSubArrayUsingBruteForce(array));
	}

	/**
	 * Tests getting of largest contiguous sub array from an unordered array using
	 * Khadane's algorithm.
	 */
	@Test
	public void testLargestSumSubArrayFromUnorderedArrayUsingKhadane() {
		int[] array = new int[] { 456, -231, -234, 46, 38, 388, -1, 0, -4 };
		assertArrayEquals(new int[] { 46, 38, 388 }, TaskTwo.getLargestSumSubArrayUsingKhadaneAlgorithm(array));
	}

	/**
	 * Tests getting of largest contiguous sub array form an ordered array using
	 * brute force.
	 */
	@Test
	public void testLargestSumSubArrayFromOrderedArrayUsingBruteForce() {
		int[] array = new int[] { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, TaskTwo.getLargestSumSubArrayUsingBruteForce(array));
	}

	/**
	 * Tests getting of largest contiguous sub array form an ordered array using
	 * Khadane's algorithm.
	 */
	@Test
	public void testLargestSumSubArrayFromOrderedArrayUsingKhadanes() {
		int[] array = new int[] { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				TaskTwo.getLargestSumSubArrayUsingKhadaneAlgorithm(array));
	}

	/**
	 * Test equality of result for both algorithms and shows efficiency.
	 */
	@Test
	public void testComparisonBetweenTwoApprachesForFindingLargestSumSubArrayFromARandomArray() {
		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000) - 500;
		}

		assertArrayEquals(TaskTwo.getLargestSumSubArrayUsingBruteForce(array),
				TaskTwo.getLargestSumSubArrayUsingKhadaneAlgorithm(array));
	}
}
