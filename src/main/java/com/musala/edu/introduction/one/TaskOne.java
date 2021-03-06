package com.musala.edu.introduction.one;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.musala.edu.introduction.one.model.MaxHeap;

/**
 * The {@code TaskOne} is a static class
 * 
 * @author georgi.kavalov
 *
 */
public class TaskOne {

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskOne.class);

	/**
	 * Constructor
	 */
	private TaskOne() {
		throw new IllegalStateException("TaskOne is a static class");
	}

	/**
	 * Finds the index of the median of an array by using sorting it.
	 * 
	 * @param array
	 *            of integer values
	 * @return An integer value representing an index of the array. -1 if not found.
	 */
	public static int getIndexOfMedianBySort(int[] array) {
		long start = System.currentTimeMillis();
		int median = getMedianValueBySort(Arrays.copyOf(array, array.length));
		long end = System.currentTimeMillis();
		int medianIndex = findIndexOfValue(array, median);
		String stringifiedArray = Arrays.toString(array);
		LOGGER.info("The array {} has a median {} at index {} and was found in {} ms", stringifiedArray, median,
				medianIndex, end - start);
		return medianIndex;
	}

	/**
	 * Calculates the median of an array.
	 * 
	 * @param array
	 *            An array of integers
	 * @return The integer value of the median of the array
	 */
	private static int getMedianValueBySort(int[] array) {
		int result = -1;
		int arrayLength = array.length;
		Arrays.sort(array);
		if (arrayLength % 2 != 0) {
			result = array[arrayLength / 2];
		} else {
			result = (array[(arrayLength - 1) / 2] + array[arrayLength / 2]) / 2;
		}
		return result;
	}

	/**
	 * Finds the index of a value in an array
	 * 
	 * @param array
	 *            The array to be searched.
	 * @param value
	 *            The integer value to look for in the array.
	 * @return The index of the first occurrence of the searched value or the one
	 *         that is closest by value
	 */
	private static int findIndexOfValue(int[] array, int value) {
		int resultIndex = 0;
		int closest = 0;
		while (resultIndex < array.length) {
			if (array[resultIndex] == value) {
				break;
			} else if (Math.abs(array[resultIndex] - value) < Math.abs(array[closest] - value)) {
				closest = resultIndex;
			}
			resultIndex++;
		}

		if (resultIndex == array.length) {
			String stringifiedArray = Arrays.toString(array);
			LOGGER.error("Value {} not found in array array {}", value, stringifiedArray);
			resultIndex = closest;
		}
		return resultIndex;
	}

	/**
	 * Finds the index of the median of an array by using a Heap structure.
	 * 
	 * @param array
	 *            of integer values
	 * @return An integer value representing an index of the array. -1 if not found.
	 */
	public static int getIndexOfMedianByHeap(int[] array) {
		long start = System.currentTimeMillis();
		int median = getMeadianValueByHeap(array);
		long end = System.currentTimeMillis();
		int medianIndex = findIndexOfValue(array, median);
		String stringifiedArray = Arrays.toString(array);
		LOGGER.info("The array {} has a median {} at index {} and was found in {} ms", stringifiedArray, median,
				medianIndex, end - start);
		return medianIndex;
	}

	private static int getMeadianValueByHeap(int[] array) {
		MaxHeap heap = new MaxHeap(array);
		int count = (array.length % 2 == 1) ? array.length / 2 : array.length / 2 - 1;
		for (int i = 0; i < count; i++) {
			heap.poll();
		}
		return heap.peek();
	}
}
