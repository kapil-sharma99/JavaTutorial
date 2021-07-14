package com.kapilsharma.concurrency;

public class ByCounter {
	private int i =0;
	private int j = 0;
	
	public int getJ() {
		return j;
	}
	
	synchronized public void incrementJ() { //synchronized will make sure that only one thread will be using this function at a time
		j++; //not an atomic operation(no thread safe)
		//thread safety: Method can be safely run by multiple threads
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementI() { //synchronized will make sure that only one thread will be using this function at a time
		i++; //not an atomic operation(no thread safe)
		//thread safety: Method can be safely run by multiple threads
	}
	
	//at any instance only one thread will be executing the all synchronized methods: drawback
}
