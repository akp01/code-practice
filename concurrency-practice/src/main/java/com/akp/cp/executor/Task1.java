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
	
	private int threadCount = 0;
	
	Task1(int count){
		threadCount = count;
	}

	public String call() throws Exception {

		System.out.println("Thread " + threadCount + " starts");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread " + threadCount + " completes");
		return "Done";
	}

}
