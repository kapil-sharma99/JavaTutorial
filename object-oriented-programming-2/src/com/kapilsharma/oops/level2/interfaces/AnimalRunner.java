package com.kapilsharma.oops.level2.interfaces;

public class AnimalRunner {
	
	abstract class Animal {
		abstract void bark();
	}
	
	class Dog extends Animal {
		public void bark() {
			System.out.println("BOW BOW!!");
		}
	}
	
	class Cat extends Animal {
		public void bark() {
			System.out.println("MEOW MEOW!!");
		}
	}

	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog()};
		for(Animal obb : animals) {
			obb.bark();
		}
	}

}
