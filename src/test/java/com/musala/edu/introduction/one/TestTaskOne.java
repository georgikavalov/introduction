package com.musala.edu.introduction.one;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * The {@code TestTaskOne} class contains unit tests for task one of part one
 * 
 * @author georgi.kavalov
 *
 */
public class TestTaskOne {

	/**
	 * Tests getting the median on an array of odd size using sorting and a heap.
	 */
	@Test
	public void testMedianOnOddSizedArray() {
		final int[] array = new int[] { 5, 4, 4, 1, 2, 0, 3, 9, 8 };
		assertArrayEquals(new int[] { 1 }, new int[] { TaskOne.getIndexOfMedianBySort(array) });
		assertArrayEquals(new int[] { 1 }, new int[] { TaskOne.getIndexOfMedianByHeap(array) });
	}

	/**
	 * Tests getting the median on an array of even size
	 */
	@Test
	public void testMedianOnEvenSizedArray() {
		final int[] array = new int[] { 5, 6, 1, 0, 9, 1 };
		assertArrayEquals(new int[] { 0 }, new int[] { TaskOne.getIndexOfMedianBySort(array) });
		assertArrayEquals(new int[] { 0 }, new int[] { TaskOne.getIndexOfMedianByHeap(array) });
	}

	/**
	 * Tests getting the median on an array of same values.
	 */
	@Test
	public void testMedianOnArrayOfSameValues() {
		final int[] array = new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		assertArrayEquals(new int[] { 0 }, new int[] { TaskOne.getIndexOfMedianBySort(array) });
	}

	/**
	 * Tests an array of ten random integers.
	 */
	@Test
	public void testMedianOnRandomArray() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		assertNotEquals(-1, TaskOne.getIndexOfMedianBySort(array));
	}
}