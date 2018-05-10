/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author akp
 *
 */
public class FixedThreadPoolExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		executor.submit(new Task1());
		executor.submit(new Task2());
		executor.submit(new Task1());
		executor.submit(new Task3());
		executor.submit(new Task2());
		executor.submit(new Task1());
		executor.submit(new Task2());
		executor.submit(new Task3());
		executor.shutdown();
	}

}


