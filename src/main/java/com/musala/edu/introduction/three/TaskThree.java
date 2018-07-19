package com.musala.edu.introduction.three;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@code TaskThree} is a static class
 * 
 * @author georgi.kavalov
 *
 */
public class TaskThree {

	private static final Logger LOGGER = LoggerFactory.getLogger(TaskThree.class);
	private static int[] tempArray;

	/**
	 * Constructor
	 */
	private TaskThree() {
		throw new IllegalStateException("TaskThree is a static class");
	}

	/**
	 * Sorts an array. Method is available to the client.
	 * 
	 * @param array
	 *            A list of integers
	 */
	public static void mergeSort(int[] array) {
		String stringifiedArray = Arrays.toString(array);
		LOGGER.info("Array before sort: {}", stringifiedArray);
		tempArray = new int[array.length];
		mergeSort(array, 0, array.length - 1);
		tempArray = null;
		stringifiedArray = Arrays.toString(array);
		LOGGER.info("Array after sort: {}", stringifiedArray);
	}

	/**
	 * Private method
	 * 
	 * @param array
	 *            subarray to sort
	 * @param left
	 *            integer end index of the left part
	 * @param right
	 *            integer end index of the right part
	 */
	private static void mergeSort(int[] array, int left, int right) {
		if (right <= left) {
			return;
		}

		int middle = (right + left) / 2;
		mergeSort(array, left, middle);
		mergeSort(array, middle + 1, right);
		int i;
		int j;
		int k;
		for (i = middle + 1; i > left; i--) {
			tempArray[i - 1] = array[i - 1];
		}
		for (j = middle; j < right; j++) {
			tempArray[right + middle - j] = array[j + 1];
		}
		for (k = left; k <= right; k++) {
			array[k] = (tempArray[i] < tempArray[j] ? tempArray[i++] : tempArray[j--]);
		}
	}
}