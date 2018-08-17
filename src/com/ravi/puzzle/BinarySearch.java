/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class BinarySearch {

	static final int[] inputArray = {2, 5, 8, 12, 22, 38, 43, 46, 54, 65};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int index = getNumberIndexRegular(inputArray, 38, 0, inputArray.length - 1);
		System.out.println("The index: "+index);

	}
	
	
	/**
	 * Binary search with recursion
	 * @param inputArray
	 * @param number
	 * @param startIndex
	 * @param endIndex
	 * @return index
	 */
	private static int getNumberIndex(int[] inputArray, int number, int startIndex, int endIndex){
				
		int middleIndex = (startIndex+endIndex)/2;
		
		if(number == inputArray[middleIndex]){
			return middleIndex;
		}
		else if(number < inputArray[middleIndex]){
			return getNumberIndex(inputArray, number, startIndex, middleIndex-1);
		}
		else{
			return getNumberIndex(inputArray, number, middleIndex+1, endIndex);
		}
		
	}
	
	/**
	 * Binarysearch without recursion
	 * @param inputArray
	 * @param number
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private static int getNumberIndexRegular(int[] inputArray, int number, int startIndex, int endIndex){
		
		while(true){
			int middleIndex = (startIndex+endIndex)/2;
			if(inputArray[middleIndex] == number){
				return middleIndex;
			}
			else if(startIndex > endIndex){
				return -1;
			}
			else{
				if(inputArray[middleIndex] < number){
					startIndex = middleIndex+1;
				}
				else{
					endIndex = middleIndex - 1;
				}
			}
		}
		
	}

}
