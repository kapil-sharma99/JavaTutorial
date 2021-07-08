package com.kapilsharma.multithread;

class Task1 extends Thread {
	public void run() {
		System.out.print("\nTask1 Started");
		for(int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask1 completed");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		for(int i = 201; i < 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask2 completed");
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException{
		//Task1
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start();
		
		//Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		//wait for task1 to completed
		task1.join();
		
		//Task3
		for(int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 is done!!");
		System.out.println("\nMain Method done is done!!");
	}

}
