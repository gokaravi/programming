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

/**
 * Bubble Sort Algorithm
 * DECLARE INTEGER i, pass
	DECLARE INTEGER x [] = [ 20, 15, 12, 30, -5, 72, 456 ]
	FOR pass = 0 TO LENGTH (x) - 2
		FOR i = 0 TO LENGTH (x) - pass - 2
    		IF x [i] > x [i + 1] THEN
       		SWAP x [i], x [i + 1]
    		END IF
		NEXT i
	NEXT pass
	END
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] myNumbers = { -5, 23, 44, 36, 67, -23, -45, 56, 89, 21, 32 };

		Integer[] sortedNumbers = doBubbleSort(myNumbers);

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

	static Integer[] doBubbleSort(Integer[] myNumbers) {
		int iterationLength = myNumbers.length - 2;
		for (int pass = 0; pass <= iterationLength; pass++) 
			for (int i = 0; i <= iterationLength - pass; i++) 
				if (myNumbers[i] > myNumbers[i + 1]) {
					int temp = myNumbers[i];
					myNumbers[i] = myNumbers[i + 1];
					myNumbers[i + 1] = temp;
				}
		
		return myNumbers;
	}

}
