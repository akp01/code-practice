package com.akp.ds.ubsint;

public class Balanced {
    public static void main(String[] args) {
        String s = "[quick fox] [jumped] [the [brown] fox";
        s = "[quick fox] [jumped] ][the [brown] fox";
        s = "[qui{ck fox}] [jumped] [{the}] [brown] fox";
        //s = "[qui{ck fox}] [jumped] [{the} [brown] fox";
        Stack<String> stack1 = new Stack<>();
        
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack1.push("1");
            }else if (s.charAt(i) == ']' || s.charAt(i) == '}') {
                if(!stack1.empty()) {
                    stack1.pop();
                }
            }
        }
        if (stack1.empty()) {
            System.out.println("It is balanced");
        }else {
            System.out.println("It is NOT balanced");
        }
    }

 

}
