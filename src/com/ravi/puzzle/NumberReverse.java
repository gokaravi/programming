/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class NumberReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 12344321;
		int reverseNumber = getReversedNumber(input);
		System.out.println("The input number: "+input+" and the reversed number: "+reverseNumber);
	}
	
	private static int getReversedNumber(int input){
		int reversedNumber = 0;
		while(input != 0){
			reversedNumber = reversedNumber*10 + input%10;
			input /= 10;
		}		
		return reversedNumber;		
	}

}
