package com.kapilSharma.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionRunner {
	
	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student("Abhishek Raj", 339), 
				new Student("Pushpam Sinha", 342),
				new Student("Kapil Sharma", 343));
		
		System.out.println(students);
		
		ArrayList<Student> studentAI = new ArrayList<>(students);
		System.out.println(studentAI);
		
		Collections.sort(studentAI);
		System.out.println("Descending Order Comparator: " + studentAI);
		
		Collections.sort(studentAI, new AscendingStudentComparator());
		System.out.println("Ascending Order Comparator: " + studentAI);
	}
}
