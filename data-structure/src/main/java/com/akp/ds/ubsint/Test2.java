package com.akp.ds.ubsint;

public class Balanced {
    public static void main(String[] args) {
        String s = "[quick fox] [jumped] [the [brown] fox";
        s = "[quick fox] [jumped] ][the [brown] fox";
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '[') {
                stack.push("1");
            }else if (s.charAt(i) == ']') {
                if(!stack.empty()) {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            System.out.println("It is balanced");
        }else {
            System.out.println("It is NOT balanced");
        }
    }

 

}