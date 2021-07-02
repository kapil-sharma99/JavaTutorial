package com.kapilsharma.oops.level2;

public class StudentRunner {

	public static void main(String[] args) {
		//Student student1 = new Student();
		//student1.setName("Kapil Sharma");
		//student1.setEmail("ks2822123@gmail.com");
		
		//Person person1 = new Person();
		//person1.setName("Kapil Sharma");
		//person1.setEmail("ks2822123@gmail.com");
		//person1.setPhoneNumber("9078267211");
		//System.out.println(person1);
		
		Employee employee = new Employee();
		employee.setName("Kapil Sharma");
		employee.setEmail("ks2822123@gmail.com");
		employee.setPhoneNumber("9078267211");
		employee.setTitle("Senior Software Engineer");
		employee.setEmployeeGrade("A");
		employee.setSalary(50000);
		
		System.out.println(employee);
	}

}
