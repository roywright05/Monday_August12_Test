package com.problems;

import java.util.Stack;

public class Problem1 {
/*
 * Create a program which checks if the string has the correct order of parenthesis/brackets. 
 * 
 * ({})[] = true, []{]}[ = false
 * 
 * 
 * */
	public static void main(String[] args) {
		
		String good = "({})[]";
		String bad = "[]{]}[";
		String other = "123456";
		
		System.out.println(checkSyntax(other)); 

	}
	
	public static boolean checkSyntax(String s) {
		
		//({})[]
		
		Stack <Character> stack = new Stack <>();
		String rightSide = "";
		String leftSide = "";
		
		
		if(s.length() % 2 != 0) {
			return false;
		}		
		
		
		for(int i = 0; i < s.length(); i++) {
			
			stack.push(s.charAt(i));
		}
		
		/*
		 * [0, 1, 2, 3, 4, 5]
		 * 
		 * 3
		 * */
		for(int j = 0; j < (stack.size() / 2) ; j++) {
			
			
			leftSide += stack.get(j);
		}
		
		for(int k = (stack.size() / 2); k < stack.size(); k++) {
			
			rightSide += stack.get(k);
		}
		
		System.out.println(leftSide + " <- left side | right side->" + rightSide);
		//
		
		return true;
	}
	
	

}
