package com.musala.edu.introduction.three;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * The {@code TestTaskThree} contains tests for the merge sort implementation
 * 
 * @author georgi.kavalov
 *
 */
public class TestTaskThree {

	/**
	 * Tests sort of an array with positive integers.
	 */
	@Test
	public void testMergeSortOnPositiveIntegers() {
		int[] array = new int[] { 1, 7, 5, 4, 2, 8, 4, 0 };
		TaskThree.mergeSort(array);
		assertArrayEquals(new int[] { 0, 1, 2, 4, 4, 5, 7, 8 }, array);
	}

	/**
	 * Tests sorting of an array with positive and negative integers.
	 */
	@Test
	public void testMergeSortOnMixedIntegers() {
		int[] array = new int[] { -1, 7, 5, -4, 2, -3, 8, 4, 0, -1, };
		TaskThree.mergeSort(array);
		assertArrayEquals(new int[] { -4, -3, -1, -1, 0, 2, 4, 5, 7, 8 }, array);
	}

	/**
	 * Tests sorting of a large array with positive integers.
	 */
	@Test
	public void testLargeArray() {
		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		Arrays.sort(arrayCopy);
		TaskThree.mergeSort(array);
		assertArrayEquals(arrayCopy, array);
	}
}
