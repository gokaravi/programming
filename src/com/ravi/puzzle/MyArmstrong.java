/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 *
 */
public class MyArmstrong{

	static int number = 153;

	public static void main(String[] args){
	int count = getCount(number);
	int sumPower = getArmstrongTotal(number, count);
		if(number == sumPower){
			System.out.println("The number "+number+" is an Armstrong number");
		}
	}

	static int getCount(int number){
		int count = 0;
		while(number != 0){
			number /= 10;
			count++;
		}
		return count;
	}


	static int getArmstrongTotal(int number, int digits){
		int total = 0;
		while(number !=0){
			int input = number%10;
			number /= 10;
			total = total + powerUp(input, digits);
		}
		return total;
	}


	static int powerUp(int number, int digits){
		int start = 1;
		for(int i = 0; i < digits; i++){
			start = number*start;
		}
		return start;
	}
	
}
