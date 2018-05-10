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
public class ScheduledThreadPoolExecutor_ScheduleWithFixedDelay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int count = 0;
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		
		executor.scheduleWithFixedDelay(new Task3(++count), 5L, 10L, TimeUnit.SECONDS);
		System.out.println("Task1");
		
		executor.scheduleWithFixedDelay(new Task3(++count), 5L, 10L, TimeUnit.SECONDS);
		System.out.println("Task2");
		
		try {
			executor.awaitTermination(10L, TimeUnit.MINUTES);
		} catch (Exception e) {
		}
		
		executor.shutdown();
	}

}


