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
public class ScheduledThreadPoolExecutor_ScheduleAtFixedRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = 0;
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);

		executor.scheduleAtFixedRate(new Task3(++count), 5L, 10L, TimeUnit.SECONDS);
		System.out.println("Task9");

		try {
			executor.awaitTermination(10L, TimeUnit.MINUTES);
		} catch (Exception e) {
		}
		
		executor.shutdown();
	}

}
