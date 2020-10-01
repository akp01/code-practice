package com.akp.ds.ubsint;

import java.util.Scanner;

public class BinarySearchTest {
	public static void main(String[] args) {

		int[] sortedIntArray = { 1, 2, 3, 5, 6, 7, 9, 11, 12, 15, 16, 19, 22, 24, 25 };
		int startIndex = 0;
		int endIndex = sortedIntArray.length - 1;
		int searchValue = 0;
		Scanner console = new Scanner(System.in);

		while (searchValue != -1) {
			System.out.print("Enter search value :  ");
			searchValue = console.nextInt();

			int indexFound = binarySearchRecursively(sortedIntArray, searchValue, startIndex, endIndex);
			System.out.println("Index position found using binarySearchRecursively() : " + indexFound);

			int indexExists = binarySearchRecursively(sortedIntArray, searchValue, startIndex, endIndex);
			System.out.println("Index position found using searchValue() : " + indexExists);
		}
		System.out.println("Search Completed.");
		console.close();
	}

	public static int binarySearchRecursively(int[] arr, int value, int begin, int end) {
		if (end < begin) {
			return -1;
		}

		int middle = (begin + end) / 2;

		if (value == arr[middle]) {
			return middle;
		} else if (value < arr[middle]) {
			return binarySearchRecursively(arr, value, begin, middle - 1);
		} else {
			return binarySearchRecursively(arr, value, middle + 1, end);
		}
	}

	public static int searchValue(int[] inputArr, int searchValue, int startIndex, int endIndex) {
		if (endIndex < startIndex) {
			return -1;
		}

		int middleIndex = (startIndex + endIndex) / 2;

		if (searchValue == inputArr[middleIndex]) {
			return middleIndex;
		} else if (searchValue > inputArr[middleIndex]) {
			return searchValue(inputArr, searchValue, middleIndex + 1, endIndex);
		} else {
			return searchValue(inputArr, searchValue, startIndex, middleIndex - 1);
		}
	}

}
