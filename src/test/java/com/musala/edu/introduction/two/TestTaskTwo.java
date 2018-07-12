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
	 * Tests getting of largest contiguous sub array
	 */
	@Test
	public void testLargestSumSubArray() {
		int[] array = new int[] { 456, -231, -234, 46, 38, 388, -1, 0, 4 };
		assertArrayEquals(new int[] { 46, 38, 388, -1, 0, 4 }, TaskTwo.getLargestSumSubArrayUsingBruteForce(array));
		assertArrayEquals(new int[] { 46, 38, 388, -1, 0, 4 },
				TaskTwo.getLargestSumSubArrayUsingKhadaneAlgorithm(array));
	}
}
