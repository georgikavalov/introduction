package com.musala.edu.introduction.one.model;

import java.util.LinkedList;
import java.util.List;

public abstract class Heap {
	protected List<Integer> items = new LinkedList<Integer>();

	public Heap(int[] array) {
		for (int i = 0; i < array.length; i++) {
			items.add(array[i]);
		}
		heapifyUp();
	}

	/**
	 * Peeks into the list of values.
	 * 
	 * @return The top value of the heap
	 */
	public Integer peek() {
		if (items.isEmpty()) {
			throw new IllegalStateException();
		}
		return items.get(0);
	}

	/**
	 * Polls the list of values. The returned value is removed from the list.
	 * 
	 * @return The top value of the heap
	 */
	public Integer poll() {
		Integer item = peek();
		items.set(0, items.get(items.size() - 1));
		items.remove(items.size() - 1);
		heapifyDown();
		return item;
	}

	/**
	 * Adds an item to the heap
	 * 
	 * @param item
	 *            Integer item to be added to the heap
	 */
	public void add(Integer item) {
		items.add(item);
		heapifyUp(items.size() - 1);
	}

	/**
	 * Heapifies the whole array of items.
	 */
	protected void heapifyUp() {
		for (int i = items.size() - 1; i >= 0; i--) {
			heapifyUp(i);
		}
	}

	/**
	 * Heapifies up the list of values.
	 * 
	 * @param index
	 *            The reference index to heapify
	 */
	protected abstract void heapifyUp(int index);

	/**
	 * Heapifies down the list of values.
	 */
	protected abstract void heapifyDown();

	/**
	 * Swaps two values in the list
	 * 
	 * @param lhsIndex
	 *            The index of the first value
	 * @param rhsIndex
	 *            The index of the second value
	 */
	protected void swap(int lhsIndex, int rhsIndex) {
		int temp = items.get(lhsIndex);
		items.set(lhsIndex, items.get(rhsIndex));
		items.set(rhsIndex, temp);
	}

	protected int getLeftChildIndex(int currentIndex) {
		return 2 * currentIndex + 1;
	}

	protected int getRightChildIndex(int currentIndex) {
		return 2 * currentIndex + 2;
	}

	protected int getParentIndex(int currentIndex) {
		return (currentIndex - 1) / 2;
	}

	protected boolean hasLeftChild(int currentIndex) {
		return getLeftChildIndex(currentIndex) < items.size();
	}

	protected boolean hasRightChild(int currentIndex) {
		return getRightChildIndex(currentIndex) < items.size();
	}

	protected boolean hasParent(int currentIndex) {
		return getParentIndex(currentIndex) >= 0;
	}

	protected Integer getLeftValue(int currentIndex) {
		return items.get(getLeftChildIndex(currentIndex));
	}

	protected Integer getRightValue(int currentIndex) {
		return items.get(getRightChildIndex(currentIndex));
	}

	protected Integer getParentValue(int currentIndex) {
		return items.get(getParentIndex(currentIndex));
	}
}
