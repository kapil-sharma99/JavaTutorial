package com.kapilsharma.array;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int [] marks = {96, 87, 84, 88, 92, 81, 80, 90};
		System.out.println(marks.length);
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println(Arrays.toString(marks));
		for(int mark:marks) {
			System.out.println(mark);
		}
		
		int [] marks2 = new int[5];
		System.out.println(Arrays.equals(marks, marks2));
		Arrays.sort(marks);
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
}
