/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.Callable;

/**
 * @author akp
 *
 */
public class Task1 implements Callable<String> {

	public String call() throws Exception {

		System.out.println("Hello Inside Call Method");

		System.out.println("Executing Task One");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "Done";
	}

}
