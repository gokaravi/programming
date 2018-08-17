/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * @Aug 15, 2018
 * 
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] myNumbers = { -5, 23, 44, 36, 67, -23, -45, 56, 89, 21, 32 };

		Integer[] sortedNumbers = doSelectionSort(myNumbers);

		int length = sortedNumbers.length;
		System.out.print("{");
		for (int i = 0; i < length; i++) {
			System.out.print(sortedNumbers[i]);
			if (i != length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

	}
	
	static Integer[] doSelectionSort(Integer[] myNumbers) {
		
		int length = myNumbers.length;
		for(int i = 0; i <= length -1; i++) {
			int index = i;
			for(int j = i; j < length; j++) 
				if(myNumbers[index] > myNumbers[j]) {
					index = j;
				}
					int smallNumber = myNumbers[index];
					myNumbers[index] = myNumbers[i];
					myNumbers[i] = smallNumber;
				}	
		
		return myNumbers;
		
	}

}
