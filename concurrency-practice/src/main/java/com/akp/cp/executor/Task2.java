/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.Callable;

/**
 * @author akp
 *
 */
public class Task2 implements Callable<String> {

	public String call() throws Exception {
		
		System.out.println("Hello Inside Call Method");
		return "Hello";
	}

}
