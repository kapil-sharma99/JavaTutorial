package com.kapilsharma.tips.access.package1;

public class MethodAccessRunnerInsideSamePackage {
	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.protectedMethod();
		exampleClass.defaultMethod();
		exampleClass.publicMethod();
	}
}
