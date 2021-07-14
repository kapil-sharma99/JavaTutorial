package com.kapilsharma.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public int getJ() {
		return j.get();
	}
	
	synchronized public void incrementJ() {
		j.incrementAndGet();
	}
	
	public int getI() {
		return i.get();
	}
	
	synchronized public void incrementI() { 
		i.incrementAndGet();
	}
	
	//at any instance only one thread will be executing the all synchronized methods: drawback
}
