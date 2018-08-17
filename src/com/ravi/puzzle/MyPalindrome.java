/**
 * 
 */
package com.ravi.puzzle;
/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class MyPalindrome {
	static final String input = "vivviv";

	public static void main (String[] args){

		char[] characters = input.toCharArray();

		System.out.println("The input string "+input+" is a palindrome: "+isSameChar(characters));

}

	public static boolean isSameChar(char[] characterArray){
		for(int i = 0; i <= characterArray.length - 1; i++){
			if(characterArray[i] != (characterArray[characterArray.length -1 - i])){
				return false;
			}
		}
		return true;

	}
}
