package com.akp.ds.ubsint;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedParanthesisUsingDeque {

    public boolean isBalanced(String str) {
        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = str.toCharArray();
            int startParanthesis = 0;
            for (char c : ch) {
                if ((c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                	startParanthesis ++;
                    
                }

            }
            
            if(startParanthesis == 0) {
            	return false;
            	
            }
        }

        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty() && ((deque.peekFirst() == '{' && ch == '}') || (deque.peekFirst() == '[' && ch == ']') || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
    	BalancedParanthesisUsingDeque obj = new BalancedParanthesisUsingDeque();
    	
    	// [quick fox] [jumped] [the [brown] fox - Not balanced
    	// [quick fox] [jumped] [the] [brown] fox - balanced
    	// [quick fox] [jumped [the]] [brown] fox - balanced
    	// q]uick fox] [jumped] [the] [brown] fox - Not balanced

    	// [qui{ck fox}] [jumped] [{the} [brown] fox - Not balanced
    	// [qui{ck fox}] [jumped] [{the}] [brown] fox - balanced
    	
    	//System.out.println("[quick fox] [jumped] [the [brown] fox" + "---" + obj.isBalanced("[quick fox] [jumped] [the [brown] fox"));
    	System.out.println("[quick fox] [jumped] [the] [brown] fox" + "---" + obj.isBalanced("[quick fox] [jumped] [the] [brown] fox"));
    	
    }
}