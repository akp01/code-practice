/**
 * 
 */
package com.akp.cp.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author akp
 *
 */
public class SingleThreadScheduledExecutorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		
		executor.schedule(new Task1(++count), 5, TimeUnit.SECONDS);
		System.out.println("Task1");
		executor.schedule(new Task2(++count), 10, TimeUnit.SECONDS);
		System.out.println("Task2");
		executor.schedule(new Task1(++count), 1, TimeUnit.MINUTES);
		System.out.println("Task3");
		executor.schedule(new Task3(++count), 1, TimeUnit.MINUTES);
		System.out.println("Task4");
		executor.schedule(new Task2(++count), 1, TimeUnit.MINUTES);
		System.out.println("Task5");
		executor.schedule(new Task1(++count), 1, TimeUnit.MINUTES);
		System.out.println("Task6");
		executor.schedule(new Task2(++count), 1, TimeUnit.MINUTES);
		System.out.println("Task7");
		executor.submit(new Task3(++count));
		System.out.println("Task8");
		
		executor.shutdown();
	}

}


