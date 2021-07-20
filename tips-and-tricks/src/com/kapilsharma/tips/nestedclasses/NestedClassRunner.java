package com.kapilsharma.tips.nestedclasses;

class Person {};

public class NestedClassRunner {
	
	class InnerClass {
		public InnerClass() {
			System.out.println("Inner Class");
		}
	}
	
	static class StaticNestedClass {
		public StaticNestedClass() {
			System.out.println("Static Nested Class");
		}
	}

	public static void main(String[] args) {
		StaticNestedClass staticNestedClass = new StaticNestedClass();
	}

}
