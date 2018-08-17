/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * @Aug 16, 2018
 * 
 */
public class Anagram {

	/**
	 * @param args
	 */
	
	static final String first = "Mary";
	static final String anagram = "Army";
	public static void main(String[] args) {

		char[] firstChars = first.toLowerCase().toCharArray();
		
		String inputString = anagram.toLowerCase();
		System.out.println(isAnagram(firstChars, inputString));
		
		

	}
	
	static boolean isAnagram(char[] firstChars, String inputString) {
		
		if(firstChars.length != inputString.length()) {
			return false;
		}
		
		for(char c : firstChars) {
			
			int index = inputString.indexOf(c);
			if(index != -1) {
				inputString = inputString.substring(0, index)+inputString.substring(index+1, inputString.length());
			}
			
		}
		
		return inputString.isEmpty();
	}
	
	
	

}
