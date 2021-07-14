package com.kapilsharma.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByCounterWithLock {
	private int i =0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public int getJ() {
		return j;
	}
	
	synchronized public void incrementJ() { //synchronized will make sure that only one thread will be using this function at a time
		lockForJ.lock();
		j++; //not an atomic operation(no thread safe)
		lockForJ.unlock();
		//this lock method will allow 2 different thread to use 2 diff synchronizedd method at a time
	}
	
	public int getI() {
		return i;
	}
	
	synchronized public void incrementI() { //synchronized will make sure that only one thread will be using this function at a time
		lockForI.lock();
		i++; //not an atomic operation(no thread safe)
		lockForI.unlock();
		//thread safety: Method can be safely run by multiple threads
	}
	
	//at any instance only one thread will be executing the all synchronized methods: drawback
}
