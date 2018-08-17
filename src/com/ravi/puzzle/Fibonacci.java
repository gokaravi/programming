/**
 * https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html?m=1
 * http://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class Fibonacci {
	
	static final int input = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Regular way:");
		for(int i = 1; i <= input; i++){			
			System.out.print(getFibonacci(i)+" ");
		}
		System.out.println("");
		System.out.println("Recursion:");
		for(int i = 1; i <= input; i++){			
			System.out.print(getFibonacciRecursion(i)+" ");
		}

	}
	
	
	/**
	 * Regular way to get the fibonacci
	 * @param number
	 * @return
	 */
	private static int getFibonacci(int number){
		if(number == 1 || number == 2){
			return 1;
		}
		
		/*Example: 2, 3, 5, 8
		one -> 2
		two -> 3
		fibo -> 5,
		next
		one -> 3
		two -> 5
		fibo -> 8...
		*/
		int fibo1 =1, fibo2=1, fibonacci = 1;
		for(int i = 3; i<=number; i++){
			fibonacci = fibo1+fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;					
		}
		
		return fibonacci;
	}
	
	/**
	 * Fibonacci series with recursion
	 * @param number
	 * @return
	 */
	private static int getFibonacciRecursion(int number){		
		if(number == 1 || number == 2){
			return 1;
		}		
		return getFibonacciRecursion(number - 1) + getFibonacciRecursion(number - 2);
	}

}
