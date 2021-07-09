package com.kapilsharma.exeptionhandling;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
