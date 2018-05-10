package com.akp.cp.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BasicThreadPoolExecutorExample {
	public static void main(String[] args) {
		// Use the executor created by the newCachedThreadPool() method
		// only when you have a reasonable number of threads
		// or when they have a short duration.
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		for (int i = 0; i <= 5; i++) {
			Task12 task = new Task12("Task " + i);
			System.out.println("A new task has been added : " + task.getName());
			executor.execute(task);
		}
		executor.shutdown();
	}

}

class Task12 implements Runnable {
	private String name;

	public Task12(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void run() {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Doing a task during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}