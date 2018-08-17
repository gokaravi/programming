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
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "Ravi Kumar Goka";

System.out.println(reverseString(input));
	}
	
	static String reverseString(String input) {
		
		int size = input.length();
		String reverse = "";
		for(int i = size-1; i >= 0; i--) {
			reverse = reverse+input.charAt(i);
			
		}
		return reverse;
	}

}
