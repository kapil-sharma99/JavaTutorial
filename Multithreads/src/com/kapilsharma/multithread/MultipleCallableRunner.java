package com.kapilsharma.multithread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exe = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks = List.of(new CallableTask("Kapil Sharma"), new CallableTask("Ritesh Sharma"));
		
		List<Future<String>> results = exe.invokeAll(tasks); // invoke all will wait till all the task completed and then put them in tasks	
		for(Future<String> result:results) {
			System.out.println(result.get());
		}
//		System.out.print("\nnew CallableTask(\"Kapil Shatma\") executed");
//		String welcomeMsg = welcomeFuture.get();
//		System.out.println(welcomeMsg);
		
		exe.shutdown();
	}

}
