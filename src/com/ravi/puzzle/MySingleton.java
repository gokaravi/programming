/**
 * 
 */
package com.ravi.puzzle;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com
 * Aug 14, 2018
 */
public class MySingleton {
	
	private MySingleton(){
	}

	private static volatile MySingleton _instance;

	public static MySingleton getInstance(){
	if(null == _instance){
			synchronized (MySingleton.class){
				if(null == _instance){
				_instance = new MySingleton();
				}

			}
	}
	return _instance;

	}
}
