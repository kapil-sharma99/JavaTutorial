package com.kapilsharma.tips.nestedclasses;

class Person {};

public class NestedClassRunner {
	
	class InnerClass {
		public InnerClass() {
			super();
			System.out.println("Inner Class");
		}
	}
	
	static class StaticNestedClass {
		public StaticNestedClass() {
			super();
			System.out.println("Static Nested Class");
		}
	}

	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass(); //StaticNestedClass can be created without the instance of enclosing class
		
		NestedClassRunner nestedClassRunner = new NestedClassRunner();
		InnerClass innerClass = nestedClassRunner.new InnerClass(); //Inner Class cannot be created without the instance of enclosing class
	}

}
