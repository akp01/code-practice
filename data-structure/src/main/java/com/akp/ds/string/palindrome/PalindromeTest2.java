package com.akp.ds.string.palindrome;

import java.util.Scanner;

public class PalindromeTest2 {
	public static void main(String args[]) {
	       
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a String");
        String input = reader.nextLine();
        
        System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
        
        
        System.out.println("Please enter another String");
        input = reader.nextLine();
        
        System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
        
        reader.close();
        

    }

    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(array[i]);
        }

        String reverseOfString = sb.toString();

        return input.equals(reverseOfString);
    }


}
