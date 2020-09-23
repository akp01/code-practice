package com.akp.ds.ubsint;

public class ThreadSequence {

	public static void main(String[] args) {
		Thread t1 = new Thread(new SequenceRunnable(1), "T1");
		Thread t2 = new Thread(new SequenceRunnable(2), "T2");
		Thread t3 = new Thread(new SequenceRunnable(0), "T3");

		t1.start();
		t2.start();
		t3.start();
	}
}

class SequenceRunnable implements Runnable {
	int threadNumber;
	static int counter = 1;
	public static int MAX_COUNT = 10;

	static Object lock = new Object();

	public SequenceRunnable(int val) {
		this.threadNumber = val;
	}

	public void run() {
		while (counter < MAX_COUNT - 1) {
			synchronized (lock) {
				while (counter % 3 != threadNumber) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " : " + counter);
				counter++;
				lock.notifyAll();
			}

		}

	}

}
