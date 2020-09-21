package com.akp.ds.sorting;

import com.akp.ds.array.PrintArray;

public class QuickSort1 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] arr = {7, 2, 11, 56, 123, 5, 78, 90, 04, -1, -2, 33, 22};

		System.out.println(" Array before sorting : ");
		PrintArray.printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println(" Array aftre sorting : ");
		PrintArray.printArray(arr);

	}


	static void quickSort(final int[] arr, final int left, final int right){

		final int pivot = arr[(left + right) / 2];
		System.out.println(" Pivot element is : " + pivot);


		int i = left;
		int j = right;

		while(i <= j){

			while(arr[i] < pivot){
				i ++;
			}

			while (arr[j] > pivot){
				j --;
			}

			if( i <= j){
				final int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i ++;
				j --;

			}

		}

		if(left < j){
			quickSort(arr, left, j);
		}

		if(i < right){
			quickSort(arr, i, right);
		}
	}



}
