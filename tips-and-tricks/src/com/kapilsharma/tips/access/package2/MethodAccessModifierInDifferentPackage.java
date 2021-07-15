package com.kapilsharma.tips.access.package2;

import com.kapilsharma.tips.access.package1.ExampleClass;

public class MethodAccessModifierInDifferentPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.publicMethod();
		//In different pacakge only public method of any class is accessible
	}

}
