package com.akp.sorting;

import com.akp.ds.print.array.PrintArray;

public class BubbleSort1 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final int[] arr = { 7, 2, 11, 56, 123, 5, 78, 90, 04, -1, -2, 33, 22 };

		System.out.println(" Array before sorting : ");
		PrintArray.printArray(arr);
		bubbleSort(arr);
		System.out.println(" Array aftre sorting : ");
		PrintArray.printArray(arr);

	}

	static void bubbleSort1(final int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - 1 - i); j++) {
				if (arr[j] > arr[j+1]) {
					final int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	static void bubbleSort(final int[] arr) {

		boolean status = true;
		int j = 0, pass = 1;
		while (status){
			status = false;
			j ++;
			for(int i = 0; i < (arr.length - j); i ++){
				if(arr[i] > arr[i+1]){
					final int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					status = true;
				}
			}


			System.out.println(" Pass : " + pass);
			pass ++;


		}
	}

}
