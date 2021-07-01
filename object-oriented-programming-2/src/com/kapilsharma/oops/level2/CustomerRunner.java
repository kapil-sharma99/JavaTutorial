package com.kapilsharma.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("CDA", "Cuttack", "Odisha", "753014");
		Customer customer = new Customer("Kapil Sharma", homeAddress);
		Address workAddress = new Address("Patiya", "Bhubaneswar", "Odisha", "752001");
		customer.setWorkAddress(workAddress);
	}
}
