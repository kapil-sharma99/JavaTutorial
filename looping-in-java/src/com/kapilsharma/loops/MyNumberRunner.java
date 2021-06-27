package com.kapilsharma.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);
		
		boolean isPrime = number.isPrime();
		System.out.println("isPrime: " + isPrime);
		
		int sum = number.sumUptoN();
		System.out.println("SumUptoN: " + sum);
		
		int sumOfDivisors = number.sumOfDivisor();
		System.out.println("SumOfDivisors: " + sumOfDivisors);
		
		number.printNumberTriangle();
	}

}
