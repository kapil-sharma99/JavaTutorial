package com.kapilsharma.concurrency;

public class Counter {
	private int i =0;
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementI() { //synchronized will make sure that only one thread will be using this function at a time
		i++; //not an atomic operation(no thread safe)
		//thread safety: Method can be safely run by multiple threads
	}
}
