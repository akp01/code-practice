/**
 * 
 */
package com.akp.sorting;

/**
 * @author AkshayaParida
 * 
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int[] intArr = { 21, 11, -2, 54, 3, 78, 5, -7 };
		System.out.println(" Array before sorting : ");
		printArray(intArr);
		System.out.println("");
		System.out.println(" Slection sorting with O(n*n) complexity Starts : ");
		selectionsort(intArr);
		System.out.println("");
		System.out.println(" Array after sorting : ");
		printArray(intArr);

	}

	static void printArray(final int[] inputArr) {
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + "  ");
		}

		System.out.println(" ");
	}

	static void selectionsort(final int[] arr) {

		int j, minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;

			for (j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				final int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;

			}
		}

	}

}
