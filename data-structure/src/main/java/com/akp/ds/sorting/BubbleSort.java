package com.akp.sorting;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int[] intArr = { 21, 11, -2, 54, 3, 78, 5, -7 };
		System.out.println(" Array before sorting : ");
		printArray(intArr);
		System.out.println("");
		System.out.println(" Bubble sorting with O(n*n) complexity Starts : ");
		bubblesort1(intArr);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		printArray(intArr);

		final int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("");
		System.out.println(" Bubble sorting with best case O(n) Starts : ");
		bubblesort(arr);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		printArray(arr);

	}

	static void printArray(final int[] inputArr) {
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + "  ");
		}

		System.out.println(" ");
	}

	// Bubble sort with O(n*n) complexity for all cases
	static void bubblesort1(final int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - 1 - i); j++) {
				if (arr[j] > arr[j + 1]) {
					final int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(" Pass Number : " + (i + 1));
			printArray(arr);
		}

	}

	// Bubble sort with O(n) complexity for best case which is already sorted
	// array
	static void bubblesort(final int[] arr) {

		boolean swapped = true;
		int j = 0;

		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < (arr.length - j); i++) {

				if (arr[i] > arr[i + 1]) {
					final int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					swapped = true;
				}

			}

			System.out.println(" Pass Number : " + j);
			printArray(arr);
		}

	}

}
