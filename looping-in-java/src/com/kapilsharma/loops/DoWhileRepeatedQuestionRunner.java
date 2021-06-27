package com.kapilsharma.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int number = -1;
	
		do {
			if(number != -1) {
				System.out.println("Cube: " + (number*number*number));
			}
			System.out.print("Enter a Number: ");
			number = scanner.nextInt();
		} while(number > 0);
		System.out.println("Thank you Have fun");
	}
}
