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
//			String str = null;
//			str.length();
			int[] i = {1, 3};
			int number = i[3];
			System.out.println("Method 2!!");
		} catch(NullPointerException ex) {
			System.out.println("Null Pointer Exception...");
			ex.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index out of bounds Exception...");
			ex.printStackTrace();
		} catch(Exception ex) {
			ex.printStackTrace();
		} 
	}
}
