package com.kapilsharma.ifstatement.examples;

public class IfStatementRunner {
	public static void main(String[] args) {
		puzzle1();
		puzzle2();
	}
	
	public static void puzzle1() {
		int k = 25;
		if(k > 20) {
			System.out.println(2);
		} else if(k > 10) {
			System.out.println(3);
		} else if(k < 20) {
			System.out.println(5);
		} else {
			System.out.println(5);;
		}
	}
	
	public static void puzzle2() {
		int l = 15;
		if(l < 20) {
			System.out.println("l<20");
		} 
		if(l > 20) {
			System.out.println("l>20");
		} else {
			System.out.println("Who am I");
		}
	}
}
