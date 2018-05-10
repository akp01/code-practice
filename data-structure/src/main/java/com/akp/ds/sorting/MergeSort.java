/**
 * 
 */
package com.akp.sorting;

/**
 * @author AkshayaParida
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final int[] intArr = {21, 11, -2, 54, 3, 78, 5, -7};
		System.out.println(" Array before sorting : ");
		printArray(intArr);

		System.out.println(" Array sorting Starts : ");
		mergesort(intArr, 0, intArr.length - 1);
		System.out.println(" Array after sorting : ");
		printArray(intArr);

	}

	static void printArray(final int[] inputArr){
		for(int i = 0; i < inputArr.length; i++){
			System.out.print(inputArr[i] + "  ");
		}

		System.out.println(" ");
	}

	static void mergesort(final int[] intArr, final int low, final int high){
		if(low < high){
			final int mid = (low + high)/2;
			mergesort(intArr, low, mid);
			mergesort(intArr, mid + 1, high);
			sort(intArr, low, mid, high);
			printArray(intArr);
		}
	}

	static void sort(final int[] intArr, final int low, final int mid, final int high){

		final int[] tempArr = new int[(high - low) + 1];

		int left = low;
		int right = mid + 1;
		int k = 0;

		while((left <= mid) && (right <= high)){
			if(intArr[left] < intArr[right]){
				tempArr[k] = intArr[left];
				left ++;
			} else {
				tempArr[k] = intArr[right];
				right ++;
			}
			k ++;
		}


		if(left <= mid){
			while(left <= mid){
				tempArr[k] = intArr[left];
				left ++;
				k ++;
			}
		} else if (right <= high){
			while(right <= high){
				tempArr[k] = intArr[right];
				right ++;
				k ++;
			}
		}

		System.out.println(" Temp Array : ");
		printArray(tempArr);
		System.out.println(" ");
		for (int j = 0; j < tempArr.length; j++){
			intArr[low + j] = tempArr[j];
		}



	}

}
