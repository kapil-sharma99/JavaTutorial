package com.kapilsharma.array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int [] marks = {100, 98, 92};
		Student student = new Student("Ranga", marks);
		
		int number = student.getNoOfMarks();
		System.out.println("No. of Marks: " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of all the marks: " + sum);
		
		int maximum = student.getMaximumMark();
		System.out.println("Maximum of all the marks: " + maximum);
		
		int minimum = student.getMinimumMark();
		System.out.println("Minimum of all the marks: " + minimum);
		
		BigDecimal average = student.getAverageMark();
		System.out.println("Average of all the marks: " + average);
		
		student.addNewMark(91);
		System.out.println(student);
		
		student.removeMarkAtIndex(2);
		System.out.println(student);
	}

}
