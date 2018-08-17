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
public class WordReverse {

	/**
	 * @param args
	 */
	static final String input = "Ravi Kumar Goka";
	public static void main(String[] args) {
		
		System.out.println(getReverseWords(input.split(" ")));

	}
	
	static String getReverseWords(String[] inputArray) {
		String reversed="";
		int length = inputArray.length;
		
		for(int i=0; i<= length-1; i++) {
			
			String word = inputArray[i];
			int wordLength = word.length();
			for(int j=wordLength-1; j >= 0; j--) {
				reversed=reversed+word.charAt(j);
			}
			reversed = reversed+ " ";
			
		}
		
		return reversed;
		
	}

}
