/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.Callable;

/**
 * @author akp
 *
 */
public class MyTask implements Callable<String> {

	/* (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 */
	public String call() throws Exception {
		Thread.currentThread().set
		System.out.println("Hello Inside Call Method");
		return "Hello";
	}

}
