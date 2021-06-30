package com.kapilsharma.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	//private int[] marks = new int[]; array representation

	public Student(String name, int... marks) { //...allows to have variable no. of arguments and it must always be the last argumnet.
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	int getNoOfMarks() {
		return marks.size();
	}
	
	int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		return sum;
	}
	
//	int getMaximumMark() {
//		int max = Integer.MIN_VALUE;
//		for(int mark:marks) {
//			if(mark > max) {
//				max = mark;
//			}
//		}
//		return max;
//	} array method
	
	int getMaximumMark() {
		return Collections.max(marks);
	}
	
//	int getMinimumMark() {
//		int min = Integer.MAX_VALUE;
//		for(int mark:marks) {
//			if(min > mark) {
//				min = mark;
//			}
//		}
//		return min;
//	} array Method
	
	int getMinimumMark() {
		return Collections.min(marks);
	}
	
	BigDecimal getAverageMark() {
		int sum = getTotalSumOfMarks();
		int number = marks.size();
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
	
	public String toString() {
		return name + marks;
	}
	
	public void addNewMark(int mark) {
		marks.add(mark);
	}
	
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}
