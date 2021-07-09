package com.kapilsharma.exeptionhandling;

public class ExceptionHandlingRunner2 {
	public static void main(String[] args) {
		method1();
		System.out.println("Main Method!!");
	}

	private static void method1() {
		method2();
		System.out.println("Method 1!!");
	}

	private static void method2() {
		try {
			String str = null;
			str.length();
			System.out.println("Method 2!!");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
