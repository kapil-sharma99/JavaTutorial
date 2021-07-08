package com.kapilsharma.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
	
	String name;
	
	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello" + this.name;
	}
	
}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = exe.submit(new CallableTask("Kapil Sharma"));
		System.out.print("\nnew CallableTask(\"Kapil Shatma\") executed");
		String welcomeMsg = welcomeFuture.get();
		System.out.println(welcomeMsg);
	}

}
