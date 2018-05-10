/**
 * 
 */
package com.akp.search.binarysearch;

/**
 * @author akp
 *
 */
public class BinarySearchTest {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] arr = { 1, 5, 9, 44, 55, 68, 79, 86 };

		final int left = 0;
		final int right = arr.length - 1;

		System.out.println(binarySearch(arr, 79, left, right));

	}

	private static final int binarySearch(final int[] arr, final int value, final int left, final int right) {

		if (left > right) {
			return -1;
		}

		final int mid = (left + right) / 2;

		if (arr[mid] == value) {
			return mid;
		} else if (arr[mid] > value) {
			return binarySearch(arr, value, left, mid - 1);
		} else if (arr[mid] < value) {
			return binarySearch(arr, value, mid + 1, right);
		} else {
			return -1;
		}
	}

}
