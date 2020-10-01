package com.akp.ds.ubsint;

import java.util.concurrent.Semaphore;

public class ThreadSequenceTest3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintTask(1), "T1");
		Thread t2 = new Thread(new PrintTask(2), "T2");
		Thread t3 = new Thread(new PrintTask(3), "T3");
		Thread t4 = new Thread(new PrintTask(4), "T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}



class Foo {
	Semaphore run2, run3;

	public Foo() {
		run2 = new Semaphore(0);
		run3 = new Semaphore(0);
	}

	public void first(Runnable printFirst) throws InterruptedException {
		printFirst.run();
		run2.release();
	}

	public void second(Runnable printSecond) throws InterruptedException {
		run2.acquire();
		printSecond.run();
		run3.release();
	}

	public void third(Runnable printThird) throws InterruptedException {
		run3.acquire();
		printThird.run();
	}
}


class PrintJob implements Runnable {
	static int MAX_COUNT = 10;
	static int counter = 1;
	static int flag = 1;
	static Object objectLock = new Object();
	int threadNumber;

	PrintJob(int value) {
		this.threadNumber = value;
	}

	public void run() {

		synchronized (objectLock) {
			while (counter < (MAX_COUNT - 1)) {

				while (flag != threadNumber) {
					try {
						objectLock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (flag == 1) {
					flag = 2;
				} else if (flag == 2) {
					flag = 3;
				} else if (flag == 3) {
					flag = 4;
				} else if (flag == 4) {
					flag = 1;
				}

				System.out.println(Thread.currentThread().getName() + "  " + counter);
				counter++;
				objectLock.notifyAll();

			}

		}

	}

}
