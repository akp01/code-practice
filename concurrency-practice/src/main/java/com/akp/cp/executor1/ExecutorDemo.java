package com.akp.cp.executor1;

import java.util.concurrent.Executor;

public class ExecutorDemo {

	public void execute() {
		Executor executor = new Invoker();
		executor.execute(()->{
			// task to be performed
		});
	}

}
