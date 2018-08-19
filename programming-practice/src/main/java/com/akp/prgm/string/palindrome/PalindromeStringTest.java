package com.akp.prgm.string.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeStringTest {

	public static void main(String[] args) {
		// System.out.println(" String is palindrome : " + palindromeTest("madam"));
		System.out.println(" String is palindrome : " + palindromCheck("madam"));
		// System.out.println(" String is palindrome in recursive way: " +
		// recursiveWayForIntValue(121));
		// System.out.println(" String is palindrome in recursive way: " +
		// recursiveWayForIntValue(33421));

	}

	public static boolean palindromeTest(String s) {
		if (s.length() <= 1)
			return true;
		else
			return (s.charAt(0) == s.charAt(s.length() - 1)) && palindromeTest(s.substring(1, s.length() - 1));
	}

	public static String palindromCheck(String inputString) {
		int length = inputString.length();
		int i, begin, end, middle;

		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;

		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("Palindrome");
			return "yes";
		} else {
			System.out.println("Not a palindrome");
			return "no";
		}
	}

	public static void test(String original) {
		String reverse = "";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string is not a palindrome.");
	}

	public static void palindromeWithStringBuffer() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String st1 = s.nextLine();

		StringBuffer sb = new StringBuffer(st1);
		sb.reverse();
		if (st1.equals(sb.toString()))
			System.out.println("Palindrome String");
	}

	public boolean isPalindrome(String s) {
		int n = s.length();
		for (int i = 0; i < (n / 2) + 1; ++i) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean istPalindrom(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}

	public boolean isPalindrome1(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;
	}
	
	public static void palindromTest_Stack() {

        String input = "test";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseInput = "";

        while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }

        if (input.equals(reverseInput))
            System.out.println("Yo! that is a palindrome.");
        else
            System.out.println("No! that isn't a palindrome.");

    }

	

	public static String recursiveWayForIntValue(int value) {
		// Recursive
		// int n = 121;
		int temp = recursivePalindrome(value, 0);

		if (temp == value)
			return "yes";
		else
			return "no";
	}

	public static int recursivePalindrome(int n, int temp) {
		// base case
		if (n == 0)
			return temp;

		// stores the reverse of a number
		temp = (temp * 10) + (n % 10);
		return recursivePalindrome(n / 10, temp);
	}

}
