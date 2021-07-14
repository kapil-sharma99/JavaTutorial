package com.kapilsharma.concurrency;

public class ConcurrencyRunner {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.incrementI();
		counter.incrementI();
		counter.incrementI();
		counter.incrementI();
		System.out.println(counter.getI());
	}

}
