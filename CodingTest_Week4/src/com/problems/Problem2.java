package com.problems;

public class Problem2 {
	
	/*Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

	strCopies("catcowcat", "cat", 2) → true
	strCopies("catcowcat", "cow", 2) → false
	strCopies("catcowcat", "cow", 1) → true
	
	substring(startingIndex, how far out from beginning of string)
	*/

	public static void main(String[] args) {
		
			String me = "Roy Wright";
			String sub = "on";
			String another = "comeoncomeon";
			
			System.out.println(strCopies(another, sub, 2));
			
			
	}
	
	public static boolean strCopies(String s, String sub, int occurences) {
		
		String s1 = "";
		int numOfOccurneces = 0;
		
		int subLength = sub.length();//3
		int sLength = s.length();//10
		
		for(int i = 0; i <= (sLength - subLength) ; i++) {
			
			 if(sub.equals(s.substring(i, i + subLength))) {
				numOfOccurneces++;
				
			}
			
		}
		
		if(numOfOccurneces >= occurences) {
			
				return true;
				
		}else {
			
			return false;
		}
	}

}
