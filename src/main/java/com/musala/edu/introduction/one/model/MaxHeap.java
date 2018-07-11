package com.musala.edu.introduction.one.model;

/**
 * The {@code MaxHeap} represents a heap where the biggest value of the list of
 * values is at the top node
 * 
 * @author georgi.kavalov
 *
 */
public class MaxHeap extends Heap {

	public MaxHeap(int[] array) {
		super(array);
	}

	/**
	 * Heapifies up the list of values. Moves higher values from the bottom to the
	 * top
	 * 
	 * @param index
	 *            The reference index to heapify
	 */
	@Override
	protected void heapifyUp(int index) {
		while (hasParent(index) && getParentValue(index) < items.get(index)) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	/**
	 * Heapifies down the list of values. Moves lower values from the top to the
	 * bottom
	 */
	@Override
	protected void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int greaterChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && getRightValue(index) > getLeftValue(index)) {
				greaterChildIndex = getRightChildIndex(index);
			}

			if (items.get(index) > items.get(greaterChildIndex)) {
				break;
			} else {
				swap(index, greaterChildIndex);
			}
			index = greaterChildIndex;
		}
	}
}
