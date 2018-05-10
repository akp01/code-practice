package com.akp.cp.executor;

public class Task3 implements Runnable {

	public void run() {
		System.out.println("Executing Task Three");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}