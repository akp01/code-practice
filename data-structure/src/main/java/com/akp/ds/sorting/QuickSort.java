/**
 * 
 */
package com.akp.sorting;

import com.akp.ds.array.PrintArray;

/**
 * @author AkshayaParida
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] intArr = { 21, 11, -2, 54, 3, 78, 5, -7 };
		System.out.println(" Array before sorting : ");
		PrintArray.printArray(intArr);
		System.out.println("");
		System.out.println(" Array sorting Starts : ");
		quicksort(intArr, 0, intArr.length - 1);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		PrintArray.printArray(intArr);

	}

	// Quick Sort Algorithim Implementation
	static void quicksort(final int[] arr, final int left, final int right) {

		final int pivot = arr[(left + right) / 2];
		System.out.println(" Pivot element is : " + pivot);
		PrintArray.printArray(arr);

		int i = left;
		int j = right;

		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				final int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		if (left < j) {
			quicksort(arr, left, j);
		}

		if (i < right) {
			quicksort(arr, i, right);
		}

	}

}
