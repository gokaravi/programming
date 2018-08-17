/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Aug 14, 2018
 */
public class ThreadLambda {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {// This is the implementation of run()
											// method. Runnable is a Functional
											// Interface.
					for (int i = 0; i < 10; i++) {
						System.out.println("Hello from child thread.");
					}
				});
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from main thread.");
		}
	}
}
