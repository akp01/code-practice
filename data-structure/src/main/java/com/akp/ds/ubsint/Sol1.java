package com.akp.ds.ubsint;

public class Sol1 {

    public static void main(String[] args) {
        // Write a program to find out if string “[quick fox] [jumped] [the [brown] fox” has balanced parenthesis or not.
        
        System.out.println( checkParanthesis("[quick fox] [jumped] [the [brown] fox") );
    }
    
    public static boolean checkParanthesis(String str) {
        
        char chArr[] =str.toCharArray();
        Stack<Character> stack= new Stack<Character>();
        
        for(char c:chArr) {
            if (c == '[') stack.push(c);
            if (c == ']') stack.pop();
        }
        
        if (stack.isEmpty())
            return true;
        
        return false;        
    }
}