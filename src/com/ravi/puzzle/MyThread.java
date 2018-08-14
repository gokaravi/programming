/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com
 * Aug 14, 2018
 */
public class MyThread {
	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda expression child thread");
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda expression main thread");
		}

	}

}
