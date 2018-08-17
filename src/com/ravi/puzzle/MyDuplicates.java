/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class MyDuplicates {
	static final  String sentence = "Hello Ravi Hello How is Ravi";

	public static void main(String[] args){

		String[] words = sentence.split(" ");
		int length = words.length;
		String finalString = "";
			for(int i = 0; i <= length - 1; i++){
				if(!isPresent(words, i, words[i])){
					finalString = finalString+" "+words[i];
				}

			}

			System.out.println(finalString.trim());
	}


	public static boolean isPresent(String[] words, int endIndex, String word){
			if(endIndex == 0){
				return false;
			}
			int length = words.length;
			for(int i = 0; i<= endIndex - 1; i++){
				if(words[i].equals(word)){
					return true;
				}
			}
			return false;
		}
}
