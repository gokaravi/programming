/**
 * 
 */
package com.ravi.design.singleton;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * @Aug 16, 2018
 * 
 */
public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread thread = new Thread(
				() ->  {
			for(int i = 0; i <= 10; i++) {
				Singleton singleton = Singleton.getInstance();
				System.out.println("The sigleton object one: "+singleton);
			}
		});
		
		Thread thread1 = new Thread(
				() ->  {
			for(int i = 0; i <= 10; i++) {
				Singleton singleton = Singleton.getInstance();
				System.out.println("The sigleton object two: "+singleton);
			}
		});
		
		Thread thread2 = new Thread(
				() ->  {
			for(int i = 0; i <= 10; i++) {
				Singleton singleton = Singleton.getInstance();
				System.out.println("The sigleton object three: "+singleton);
			}
		});
		
		
		thread.start();
		thread1.start();
		thread2.start();
	}

}
