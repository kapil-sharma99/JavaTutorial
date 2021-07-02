package com.kapilsharma.oops.level2;

public class Employee extends Person{
	private String title;
	private String employer;
	private String employeeGrade;
	private int salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("Name: %s, Email: %s, Phone Number: %s, Title: %s, Employer: %s, Employee Grade: %s, Salary: %d",
				getName(), getEmail(), getPhoneNumber(), title, employer, employeeGrade, salary);
	}
}
