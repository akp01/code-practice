package com.akp.sorting;

/**
 * @author AkshayaParida
 * 
 */
public class MergeSort1 {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] intArr = { 0,1,1,1,1,0,0,1,1,0,0,1};
		System.out.println(" Array before sorting : ");
		printArray(intArr);

		System.out.println(" Array sorting Starts : ");
		mergesort(intArr, 0, intArr.length - 1);
		System.out.println(" Array after sorting : ");
		printArray(intArr);

	}

	static void printArray(final int[] inputArr) {
		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(inputArr[i] + "  ");
		}

		System.out.println(" ");
	}

	static void mergesort(final int[] arr, final int low, final int high) {

		final int mid = (low + high) / 2;

		int left = low;
		final int right = high;

		while((left <= mid) && (right > mid)){
			while(arr[left] == 0){
				left ++;
			}
		}


	}



}