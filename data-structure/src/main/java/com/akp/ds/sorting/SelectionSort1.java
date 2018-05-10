package com.akp.sorting;

import com.akp.ds.print.array.PrintArray;

public class SelectionSort1 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] intArr = { 21, 11, -2, 54, 3, 78, 5, -7 };
		System.out.println(" Array before sorting : ");
		PrintArray.printArray(intArr);
		System.out.println("");
		System.out.println(" Insertion sorting with O(n*n) complexity Starts : ");
		selectionSort(intArr);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		PrintArray.printArray(intArr);

	}

	static void selectionSort(final int[] arr) {

		int minIndex, j;

		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

				if (minIndex != i) {
					final int temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}

	}

}
