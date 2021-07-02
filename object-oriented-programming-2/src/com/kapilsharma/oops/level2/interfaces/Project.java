package com.kapilsharma.oops.level2.interfaces;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new DummyAlgorithm();
		System.out.print("Dummy Algorithm: ");
		System.out.println(algorithm.complexAlgorithm(10, 20));
		
		ComplexAlgorithm algorithm2 = new RealAlgorithm();
		System.out.print("Real Algorithm: ");
		System.out.println(algorithm2.complexAlgorithm(10, 20));
	}

}
