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
		
		int count = 0;
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.submit(new Task1(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task1(++count));
		executor.submit(new Task3(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task1(++count));
		executor.submit(new Task2(++count));
		executor.submit(new Task3(++count));
		executor.shutdown();
	}

}


