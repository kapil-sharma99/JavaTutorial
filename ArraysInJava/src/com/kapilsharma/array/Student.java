package com.kapilsharma.array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	String name;
	int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}
	
	int getNoOfMarks() {
		return marks.length;
	}
	
	int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}
	
	int getMaximumMark() {
		int max = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark > max) {
				max = mark;
			}
		}
		return max;
	}
	
	int getMinimumMark() {
		int min = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(min > mark) {
				min = mark;
			}
		}
		return min;
	}
	
	BigDecimal getAverageMark() {
		int sum = getTotalSumOfMarks();
		int number = marks.length;
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

}
