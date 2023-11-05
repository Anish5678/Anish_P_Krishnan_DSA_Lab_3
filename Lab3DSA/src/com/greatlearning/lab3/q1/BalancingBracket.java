package com.greatlearning.lab3.q1;

import java.util.Stack;

public class BalancingBracket {
	
	public boolean isBalancedBracket(String input) {
		/*
		 * For each character in input string 
		 * 1) if it is open bracket, then push into the stack
	     * 2) if it is a closed bracket, then we will pop out last value
         * 3) Then, we will verify whether it is corresponding matching
		 */
		//if(input ==null || input.isBlank()){{
		//	System.out.println("Empty input String");
		//	return false;
		//}
		Stack <Character> stack = new Stack<Character>();
		
		for(char ch : input.toCharArray()) {
			
			if(ch == '{'|| ch == '('||ch == '['){
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			switch(ch) {
			case '}' :
				if(stack.pop()!='{') {
					return false;
				}
				break;
			case ']':
				if(stack.pop()!='[') {
					return false;
				}
				break;
			case ')' :
				if(stack.pop()!= '(') {
					return false;
				}
				break;
				default:
					System.out.println("invalid character in input string");
					return false;
			}
		}
		
		return stack.isEmpty();
	}
}

