package com.kapilsharma.oops.level2.interfaces;

public class FlyableRunner {
	
	interface Flyable {
		void fly();
	}
	
	class Bird implements Flyable {

		@Override
		public void fly() {
			System.out.println("With Wings!!!");
		}
		
	}
	
	class Aeroplane implements Flyable {

		@Override
		public void fly() {
			System.out.println("With Fuels!!!");
		}
		
	}

	public static void main(String[] args) {
		Flyable[] flyableObjects = {new Bird(), new Aeroplane()};
		for(Flyable object : flyableObjects) {
			object.fly();
		}
	}

}
