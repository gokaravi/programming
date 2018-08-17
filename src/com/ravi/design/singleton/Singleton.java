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
public class Singleton {

	private static volatile Singleton _instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (null == _instance) {
			synchronized (Singleton.class) {
				if (null == _instance) {
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}
}
