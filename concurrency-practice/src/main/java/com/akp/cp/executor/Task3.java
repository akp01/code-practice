package com.akp.cp.executor;

public class Task3 implements Runnable {

	private int threadCount = 0;

	Task3(int count) {
		threadCount = count;
	}
	
	public void run() {
		System.out.println("Thread " + threadCount + " starts");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread " + threadCount + " completes");
	}
}