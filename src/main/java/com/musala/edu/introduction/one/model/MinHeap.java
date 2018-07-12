package com.musala.edu.introduction.one.model;

/**
 * The {@code MinHeap} represents a heap where the lowest value of the list of
 * values is at the top node
 * 
 * @author georgi.kavalov
 *
 */
public class MinHeap extends Heap {
	public MinHeap(int[] array) {
		super(array);
	}

	/**
	 * Heapifies down the list of values. Moves higher values from the top to the
	 * bottom
	 */
	@Override
	protected void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && getRightValue(index) < getLeftValue(index)) {
				smallerChildIndex = getRightChildIndex(index);
			}

			if (items.get(index) < items.get(smallerChildIndex)) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}

	/**
	 * Heapifies up the list of values. Moves lower values from the bottom to the
	 * top
	 * 
	 * @param index
	 *            The reference index to heapify
	 */
	@Override
	protected void heapifyUp(int index) {
		while (hasParent(index) && getParentValue(index) > items.get(index)) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
}