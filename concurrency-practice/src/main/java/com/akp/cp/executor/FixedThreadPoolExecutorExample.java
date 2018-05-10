package com.akp.cp.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExecutorExample {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		for (int i = 0; i < 10; i++) {
			Task11 task = new Task11("Task " + i);
			System.out.println("A new task has been added : " + task.getName());
			executor.execute(task);
		}
		System.out.println("Maximum threads inside pool " + executor.getMaximumPoolSize());
		executor.shutdown();
	}

}

class Task11 implements Runnable {
	private String name;

	public Task11(String name) {
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