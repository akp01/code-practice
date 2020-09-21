/**
 * 
 */
package com.akp.ds.sorting;

import com.akp.ds.array.PrintArray;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int[] intArr = { 21, 11, -2, 54, 3, 78, 5, -7 };
		System.out.println(" Array before sorting : ");
		PrintArray.printArray(intArr);
		System.out.println("");
		System.out
		.println(" Insertion sorting with O(n*n) complexity Starts : ");
		insertionSort(intArr);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		PrintArray.printArray(intArr);

	}

	static void insertionSort(final int[] arr) {

		int j, newValue;
		for (int i = 1; i < arr.length; i++) {
			newValue = arr[i];

			j = i;

			while ((j > 0) && (arr[j - 1] > newValue)) {
				arr[j] = arr[j - 1];
				j--;
			}

			arr[j] = newValue;
			System.out.println(" Insert Value :                      "
					+ newValue);
			PrintArray.printArray(arr);
			System.out.println(" ");
		}

	}

}
