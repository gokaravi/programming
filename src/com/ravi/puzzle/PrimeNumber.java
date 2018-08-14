/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com
 * Aug 14, 2018
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int number = 0; number < 89; number++){
		System.out.println("The number: "+number+" is prime: "+isPrime(number));
		}
	}
	
	private static boolean isPrime(int number){
		if(number == 0 || number == 1){
			return false;
		}
		if(number == 2 || number == 3){
			return true;
		}
		int middleNumber =  number/2;	
		for(int i = 2; i <= middleNumber; i++){
			if(i != number){
				if(number%i == 0){
					return false;
				}
			}
		}
		return true;			
	}

}
